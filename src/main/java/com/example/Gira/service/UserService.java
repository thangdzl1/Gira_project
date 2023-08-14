package com.example.Gira.service;

import com.example.Gira.entity.AcctStatEntity;
import com.example.Gira.entity.PermissionGroupEntity;
import com.example.Gira.entity.UserEntity;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.request.UserAddRequest;
import com.example.Gira.payload.request.UserUpdateRequest;
import com.example.Gira.payload.response.UserDetailsResponse;
import com.example.Gira.payload.response.UserResponse;
import com.example.Gira.repository.AcctStatRepository;
import com.example.Gira.repository.PermissionGroupRepository;
import com.example.Gira.repository.UserRepository;
import com.example.Gira.service.Imp.UserServiceImp;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceImp {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private PermissionGroupRepository permissionGroupRepository;

    @Autowired
    private AcctStatRepository acctStatRepository;

    @Override
    public boolean addUser(UserAddRequest request) {
        boolean isSuccess = false;
        try {
            UserEntity user = new UserEntity();
            user.setUsername(request.getUsername());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            user.setFullname(request.getFullname());
            user.setEmail(request.getEmail());
            PermissionGroupEntity permissionGroupEntity = permissionGroupRepository.findById(request.getPermission_group_id());
            user.setPermissionGroup(permissionGroupEntity);
            userRepository.save(user);
            isSuccess = true;
        }catch (Exception e){
            throw new CustomException("Error addUser: " + e.getMessage());
        }
        return isSuccess;
    }

    @Override
    public List<UserResponse> getAllUser() {
        List<UserResponse> responseList = new ArrayList<>();

        try {
            List<UserEntity> list = userRepository.findAll();
            for (UserEntity user : list){
                UserResponse userResponse = new UserResponse();
                userResponse.setUsername(user.getUsername());
                userResponse.setFullname(user.getFullname());
                userResponse.setEmail(user.getEmail());
                userResponse.setAvatar(user.getAvatar());
                userResponse.setId(user.getId());
                if (user.getPermissionGroup() != null) {
                    userResponse.setRole(user.getPermissionGroup().getName());
                }
                if (user.getAcct_stat() != null) {
                    userResponse.setStatus(user.getAcct_stat().getName());
                }
                responseList.add(userResponse);
            }
        }catch (Exception e){
            throw new CustomException("Error GetAllUser: " + e.getMessage());
        }
        return responseList;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean isSuccess = false;
        try {
            userRepository.deleteById(id);
            isSuccess = true;
        }catch (Exception e){
            throw new CustomException("Error deleteUser: " + e.getMessage());
        }
        return isSuccess;
    }

    @Override
    public boolean updateUser(UserUpdateRequest request) {
        boolean isSuccess = false;
        try {

            UserEntity user = userRepository.findById(request.getId());
            user.setUsername(request.getUsername());
            user.setEmail(request.getEmail());
            user.setFullname(request.getFullname());
            PermissionGroupEntity permissionGroupEntity = permissionGroupRepository.findById(request.getPermission_group_id());
            user.setPermissionGroup(permissionGroupEntity);
            AcctStatEntity acctStatEntity = acctStatRepository.findById(request.getAcct_stat_id());
            user.setAcct_stat(acctStatEntity);
            userRepository.save(user);
            isSuccess = true;

            isSuccess = true;
        }catch (Exception e){
            throw new CustomException("Error updateUser: "+ e.getMessage());
        }

        return isSuccess;
    }

    @Override
    public UserDetailsResponse detailsUser(int id) {
        boolean isSuccess = false;
        try {

            UserEntity user = userRepository.findById(id);

            isSuccess = true;
        }catch (Exception e){
            throw new CustomException("Error detailsUser: "+ e.getMessage());
        }

        return new UserDetailsResponse();
    }

}
