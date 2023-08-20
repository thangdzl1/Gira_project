package com.example.Gira.repository;

import com.example.Gira.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
    UserEntity findById(int id);

    @Query("SELECT u FROM user u JOIN u.permissionGroup pg WHERE pg.name = ?1")
    List<UserEntity> findByPermissionGroup(String role);
}
