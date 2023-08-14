package com.example.Gira.controller;

import com.example.Gira.payload.response.BaseResponse;
import com.example.Gira.payload.response.PermissionGroupResponse;
import com.example.Gira.service.Imp.PermissionGroupImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("permission_group")
@CrossOrigin
public class PermissionGroupController {
    @Autowired
    private PermissionGroupImp permissionGroupImp;

    @GetMapping("/get_all")
    public ResponseEntity<?> getAllPermissionGroup(){
        List<PermissionGroupResponse> responseList = permissionGroupImp.findAllPermissionGroup();

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(200);
        baseResponse.setData(responseList);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
