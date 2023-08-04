package com.example.Gira.service;

import com.example.Gira.entity.PermissionGroupEntity;
import com.example.Gira.entity.UserEntity;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.request.UserAddRequest;
import com.example.Gira.repository.PermissionGroupRepository;
import com.example.Gira.repository.UserRepository;
import com.example.Gira.service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceImp {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private PermissionGroupRepository permissionGroupRepository;

    @Override
    public boolean addUser(UserAddRequest request) {
        boolean isSuccess = false;
        try {
            UserEntity user = new UserEntity();
            user.setUsername(request.getUsername());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            user.setFullname(request.getFullname());
            user.setEmail(request.getEmail());
//            user.setPermissionGroup(permissionGroupRepository.findById(request.getPermission_group_id()));
            userRepository.save(user);
            isSuccess = true;
        }catch (Exception e){
            throw new CustomException(e.getMessage());
        }
        return isSuccess;
    }
}
