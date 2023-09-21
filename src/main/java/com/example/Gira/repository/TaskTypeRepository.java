package com.example.Gira.repository;

import com.example.Gira.entity.ProjectEntity;
import com.example.Gira.entity.TaskTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskTypeRepository extends JpaRepository<TaskTypeEntity,Integer> {
    List<TaskTypeEntity> findAllByProject(ProjectEntity projectId);
}
