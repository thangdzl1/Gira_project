package com.example.Gira.repository;

import com.example.Gira.entity.ProjectTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTypeRepository extends JpaRepository <ProjectTypeEntity, Integer> {
    ProjectTypeEntity findById(int id);
}
