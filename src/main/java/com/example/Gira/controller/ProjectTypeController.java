package com.example.Gira.controller;

import com.example.Gira.payload.response.BaseResponse;
import com.example.Gira.payload.response.ProjectResponse;
import com.example.Gira.payload.response.ProjectTypeResponse;
import com.example.Gira.service.Imp.ProjectServiceImp;
import com.example.Gira.service.Imp.ProjectTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project_type")
@CrossOrigin
public class ProjectTypeController {
    @Autowired
    private ProjectTypeServiceImp projectTypeServiceImp;

    @GetMapping("/getall")
    public ResponseEntity<?> getAllProject() {
        List<ProjectTypeResponse> responses = projectTypeServiceImp.findAllProjectType();
        BaseResponse response = new BaseResponse();
        response.setStatusCode(200);
        response.setData(responses);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
