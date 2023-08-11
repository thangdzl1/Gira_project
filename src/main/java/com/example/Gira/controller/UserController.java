package com.example.Gira.controller;

import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.request.UserAddRequest;
import com.example.Gira.payload.request.UserUpdateRequest;
import com.example.Gira.payload.response.BaseResponse;
import com.example.Gira.service.Imp.UserServiceImp;
import com.example.Gira.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UserServiceImp userServiceImp;


    @PostMapping("/login")
    public ResponseEntity<?> login(
            @RequestParam String username,
            @RequestParam String password
    ) {

        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
        authenticationManager.authenticate(token);
        String jwt = jwtHelper.generateToken(username);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(200);
        baseResponse.setData(jwt);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<?> userAdd(@Valid UserAddRequest request, BindingResult result) {

        List<FieldError> errors = result.getFieldErrors();
        for (FieldError error : errors) {
            throw new CustomException(error.getDefaultMessage());
        }

        boolean isSuccess = userServiceImp.addUser(request);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(isSuccess);
        baseResponse.setStatusCode(200);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> userAuthenticate() {
        boolean isSuccess = true;
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(isSuccess);
        baseResponse.setStatusCode(200);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

    @GetMapping("/table")
    public ResponseEntity<?> userTable(){

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(200);
        baseResponse.setData(userServiceImp.getAllUser());
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> userDelete(@PathVariable int id){
        boolean isSuccess = false;

        userServiceImp.deleteUser(id);
        isSuccess = true;
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(isSuccess);
        baseResponse.setStatusCode(200);

        return new ResponseEntity<>(baseResponse,HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<?> userUpdate(@Valid UserUpdateRequest request, BindingResult result ){
        List<FieldError> errors = result.getFieldErrors();
        for (FieldError error : errors) {
            throw new CustomException(error.getDefaultMessage());
        }

        boolean isSuccess = userServiceImp.updateUser(request);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(isSuccess);
        baseResponse.setStatusCode(200);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

    @GetMapping("/details/{id}")
    public ResponseEntity<?> userDetails(@PathVariable int id){
        boolean isSuccess = false;

        userServiceImp.deleteUser(id);
        isSuccess = true;
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(isSuccess);
        baseResponse.setStatusCode(200);


        return new ResponseEntity<>("",HttpStatus.OK);
    }

}
