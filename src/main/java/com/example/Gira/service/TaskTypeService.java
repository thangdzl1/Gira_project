package com.example.Gira.service;

import com.example.Gira.entity.TaskTypeEntity;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.response.TaskTypeResponse;
import com.example.Gira.repository.ProjectRepository;
import com.example.Gira.repository.TaskTypeRepository;
import com.example.Gira.service.Imp.TaskTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskTypeService implements TaskTypeServiceImp {

    @Autowired
    private TaskTypeRepository taskTypeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<TaskTypeResponse> findAllByProject(int projectId) {
        List<TaskTypeResponse> responseList = new ArrayList<>();

        try {
            List<TaskTypeEntity> list = taskTypeRepository.findAllByProject(projectRepository.findById(projectId));
            for (TaskTypeEntity taskType : list){
                TaskTypeResponse response = new TaskTypeResponse();
                response.setName(taskType.getName());
                response.setDesc(taskType.getDesc());
                response.setId(taskType.getId());
                responseList.add(response);
            }
        }catch (Exception e){
            throw new CustomException("Error findAllByProject: " + e.getMessage());
        }
        return responseList;
    }
}
