package com.example.Gira.service.Imp;

import com.example.Gira.payload.request.ProjectUpdateRequest;
import com.example.Gira.payload.response.ProjectResponse;

import java.util.List;

public interface ProjectServiceImp {
    List<ProjectResponse> findAllProject();
    boolean deleteProjectById(int id);
    boolean updateProject(ProjectUpdateRequest request);
}
