package com.example.Gira.repository;

import com.example.Gira.entity.UserEntity;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface UserRepository extends JpaRepositoryImplementation<UserEntity, Integer> {
    UserEntity findByUsername(String username);

}