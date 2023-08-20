package com.example.Gira.service;

import com.example.Gira.entity.ProjectEntity;
import com.example.Gira.entity.ProjectTypeEntity;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.response.ProjectResponse;
import com.example.Gira.payload.response.ProjectTypeResponse;
import com.example.Gira.repository.ProjectTypeRepository;
import com.example.Gira.service.Imp.ProjectServiceImp;
import com.example.Gira.service.Imp.ProjectTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectTypeService implements ProjectTypeServiceImp {
    @Autowired
    private ProjectTypeRepository projectTypeRepository;


    @Override
    public List<ProjectTypeResponse> findAllProjectType() {
        List<ProjectTypeResponse> responseList = new ArrayList<>();

        try {
            List<ProjectTypeEntity> list = projectTypeRepository.findAll();
            for (ProjectTypeEntity project : list){
                ProjectTypeResponse response = new ProjectTypeResponse();
                response.setName(project.getName());
                response.setId(project.getId());
                response.setDesc(project.getDesc());
                responseList.add(response);
            }
        }catch (Exception e){
            throw new CustomException("Error findAllProject: " + e.getMessage());
        }
        return responseList;
    }
}
