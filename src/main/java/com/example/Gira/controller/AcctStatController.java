package com.example.Gira.controller;

import com.example.Gira.payload.response.AcctStatResponse;
import com.example.Gira.payload.response.BaseResponse;
import com.example.Gira.service.Imp.AcctStatServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("acct_stat")
@CrossOrigin
public class AcctStatController {
    @Autowired
    private AcctStatServiceImp acctStatServiceImp;

    @GetMapping("/get_all")
    public ResponseEntity<?> getAllAcctStat(){
        List<AcctStatResponse> list = acctStatServiceImp.findAcctStatusResponse();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(200);
        baseResponse.setData(list);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
