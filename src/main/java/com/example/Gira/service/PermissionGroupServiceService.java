package com.example.Gira.service;

import com.example.Gira.entity.PermissionGroupEntity;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.response.PermissionGroupResponse;
import com.example.Gira.repository.PermissionGroupRepository;
import com.example.Gira.service.Imp.PermissionGroupServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionGroupServiceService implements PermissionGroupServiceImp {
    @Autowired
    private PermissionGroupRepository permissionGroupRepository;

    @Override
    public List<PermissionGroupResponse> findAllPermissionGroup() {
        List<PermissionGroupResponse> responseList = new ArrayList<>();
        try {
            List<PermissionGroupEntity> list = permissionGroupRepository.findAll();
            for (PermissionGroupEntity entity: list) {
                PermissionGroupResponse response = new PermissionGroupResponse();
                response.setDesc(entity.getDesc());
                response.setName(entity.getName());
                response.setId(entity.getId());
                responseList.add(response);
            }
        }catch (Exception e){
            throw new CustomException("Err findAllPermissionGroup: " + e.getMessage());
        }
        return responseList;
    }
}
