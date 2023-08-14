package com.example.Gira.service.Imp;

import com.example.Gira.payload.response.PermissionGroupResponse;

import java.util.List;

public interface PermissionGroupServiceImp {
    List<PermissionGroupResponse> findAllPermissionGroup();
}
