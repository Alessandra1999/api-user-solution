package com.example.api_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
