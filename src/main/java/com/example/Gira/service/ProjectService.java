package com.example.Gira.service;

import com.example.Gira.entity.*;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.request.ProjectUpdateRequest;
import com.example.Gira.payload.response.ProjectResponse;
import com.example.Gira.repository.ProjectRepository;
import com.example.Gira.repository.ProjectTypeRepository;
import com.example.Gira.repository.UserRepository;
import com.example.Gira.service.Imp.ProjectServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService implements ProjectServiceImp {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectTypeRepository projectTypeRepository;

    @Override
    public List<ProjectResponse> findAllProject() {
        List<ProjectResponse> responseList = new ArrayList<>();

        try {
            List<ProjectEntity> list = projectRepository.findAll();
            for (ProjectEntity project : list) {
                ProjectResponse response = new ProjectResponse();
                response.setName(project.getName());
                response.setIcon(project.getIcon());
                response.setId(project.getId());
                if (project.getCreatorId() != null) {
                    response.setCreator((project.getCreatorId()).getFullname());
                }
                if (project.getManagerId() != null) {
                    response.setManager((project.getManagerId()).getFullname());
                }
                if (project.getTypeId() != null) {
                    response.setType((project.getTypeId()).getName());
                }
                responseList.add(response);
            }
        } catch (Exception e) {
            throw new CustomException("Error findAllProject: " + e.getMessage());
        }
        return responseList;
    }

    @Override
    public boolean deleteProjectById(int id) {
        boolean isSuccess = false;
        try {
            projectRepository.deleteById(id);
            isSuccess = true;
        } catch (Exception e) {
            throw new CustomException("Error deleteProjectById : " + e.getMessage());
        }
        return isSuccess;
    }

    @Override
    public boolean updateProject(ProjectUpdateRequest request) {
        boolean isSuccess = false;
        try {

            ProjectEntity entity = projectRepository.findById(request.getId());
            entity.setName(request.getName());
            entity.setIcon(request.getIcon());
            UserEntity user = userRepository.findById(request.getManager_id());
            entity.setManagerId(user);
            ProjectTypeEntity projectType = projectTypeRepository.findById(request.getProject_type_id());
            entity.setTypeId(projectType);
            projectRepository.save(entity);

            isSuccess = true;
        }catch (Exception e){
            throw new CustomException("Error updateProject: "+ e.getMessage());
        }

        return isSuccess;
    }

}
