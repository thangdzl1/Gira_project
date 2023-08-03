package com.example.Gira.controller;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("/createSecretKey")
    public ResponseEntity<?> createSecretKey(){
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String key = Encoders.BASE64.encode(secretKey.getEncoded());
        System.out.println(key);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
