package com.johnmsaylor.AuthServer.repository;

import com.johnmsaylor.AuthServer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
