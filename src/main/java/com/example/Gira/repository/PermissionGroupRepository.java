package com.example.Gira.repository;

import com.example.Gira.entity.PermissionGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionGroupRepository extends JpaRepository<PermissionGroupEntity,Integer> {
    PermissionGroupEntity findById(int id);
}

