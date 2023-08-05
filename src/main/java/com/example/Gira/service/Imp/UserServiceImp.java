package com.example.Gira.service.Imp;


import com.example.Gira.entity.UserEntity;
import com.example.Gira.payload.request.UserAddRequest;
import com.example.Gira.payload.response.UserResponse;

import java.util.List;

public interface UserServiceImp {
    boolean addUser(UserAddRequest request);
    List<UserResponse> getAllUser();
}
