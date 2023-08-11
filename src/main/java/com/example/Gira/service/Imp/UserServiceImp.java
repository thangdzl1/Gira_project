package com.example.Gira.service.Imp;


import com.example.Gira.payload.request.UserAddRequest;
import com.example.Gira.payload.request.UserUpdateRequest;
import com.example.Gira.payload.response.UserDetailsResponse;
import com.example.Gira.payload.response.UserResponse;

import java.util.List;

public interface UserServiceImp {
    boolean addUser(UserAddRequest request);
    List<UserResponse> getAllUser();
    boolean deleteUser(int id);
    boolean updateUser(UserUpdateRequest request);
    UserDetailsResponse detailsUser(int id);

}
