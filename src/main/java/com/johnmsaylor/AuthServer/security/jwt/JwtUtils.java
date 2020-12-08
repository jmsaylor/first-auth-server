package com.johnmsaylor.AuthServer.security.jwt;
import com.johnmsaylor.AuthServer.security.services.UserDetailsImpl;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class JwtUtils implements Serializable {

//    private static final long serialVersionUID = what the heck?

    public static final long JWT_VALIDITY = 60;

    @Value("${app.jwtSecret}")
    private String jwtSecret;


    public String generateJwtToken(Authentication authentication){
        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();
        final Date now = new Date();

         return Jwts.builder()
                 .setSubject(userPrincipal.getEmail())
                 .claim("message", "hello")
                 .setIssuedAt(now)
                 .setExpiration(new Date(now.getTime() + JWT_VALIDITY))
                 .signWith(SignatureAlgorithm.HS256, jwtSecret)
                 .compact();
    }

    public String getUsernameFromJwtToken(String token){
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }

    public Boolean validateJwtToken(String token){
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        } catch (SignatureException e) {
            System.out.println("Signature");
        } catch (MalformedJwtException e) {
            System.out.println("Malformed");
        } catch (ExpiredJwtException e) {
            System.out.println("Expired");
        } catch (UnsupportedJwtException e) {
            System.out.println("Unsupported");
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Arguments");
        }
        return false;
    }
}
