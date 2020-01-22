package com.example.springdatademo.repository;

import com.example.springdatademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJPARepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
