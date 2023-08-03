package com.example.Gira.service;

import com.example.Gira.entity.UserEntity;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.request.UserAddRequest;
import com.example.Gira.repository.UserRepository;
import com.example.Gira.service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceImp {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean addUser(UserAddRequest request) {
        boolean isSuccess = false;
        try {
            UserEntity user = new UserEntity();
            user.setUsername(request.getUsername());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            user.setFullname(request.getFullname());
            userRepository.save(user);
            isSuccess = true;
        }catch (Exception e){
            throw new CustomException(e.getMessage());
        }
        return isSuccess;
    }
}
