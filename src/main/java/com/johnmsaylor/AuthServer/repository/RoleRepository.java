package com.johnmsaylor.AuthServer.repository;

import com.johnmsaylor.AuthServer.model.ERole;
import com.johnmsaylor.AuthServer.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
