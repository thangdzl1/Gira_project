package com.example.Gira.controller;

import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.request.ProjectUpdateRequest;
import com.example.Gira.payload.request.UserUpdateRequest;
import com.example.Gira.payload.response.BaseResponse;
import com.example.Gira.payload.response.ProjectResponse;
import com.example.Gira.service.Imp.ProjectServiceImp;
import com.example.Gira.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/project")
@CrossOrigin
public class ProjectController {
    @Autowired
    private ProjectServiceImp projectServiceImp;

    @Autowired
    private JwtHelper jwtHelper;

    @GetMapping("/getall")
    public ResponseEntity<?> getAllProject(){
        List<ProjectResponse> responses = projectServiceImp.findAllProject();
        BaseResponse response = new BaseResponse();
        response.setStatusCode(200);
        response.setData(responses);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/delete")
    public ResponseEntity<?> deleteProject(@RequestParam int id){
        boolean isSuccess = projectServiceImp.deleteProjectById(id);
        BaseResponse response = new BaseResponse();
        response.setStatusCode(200);
        response.setData(isSuccess);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<?> userUpdate(@Valid ProjectUpdateRequest request, BindingResult result ){
        List<FieldError> errors = result.getFieldErrors();
        for (FieldError error : errors) {
            throw new CustomException(error.getDefaultMessage());
        }

        boolean isSuccess = projectServiceImp.updateProject(request);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(isSuccess);
        baseResponse.setStatusCode(200);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }


}
