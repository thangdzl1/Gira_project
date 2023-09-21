package com.example.Gira.controller;

import com.example.Gira.payload.response.BaseResponse;
import com.example.Gira.service.TaskTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task_type")
public class TaskTypeController {

    @Autowired
    private TaskTypeService taskTypeService;

    @GetMapping("/get_all_by_project")
    public ResponseEntity getAllByProject(@RequestParam int projectId){
        BaseResponse response = new BaseResponse();
        response.setData(taskTypeService.findAllByProject(projectId));
        response.setStatusCode(200);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
