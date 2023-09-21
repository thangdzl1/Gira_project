package com.example.Gira.service.Imp;

import com.example.Gira.entity.TaskTypeEntity;
import com.example.Gira.payload.response.TaskTypeResponse;

import java.util.List;

public interface TaskTypeServiceImp {
    List<TaskTypeResponse> findAllByProject(int projectId);
}
