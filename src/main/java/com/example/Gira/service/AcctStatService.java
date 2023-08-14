package com.example.Gira.service;

import com.example.Gira.entity.AcctStatEntity;
import com.example.Gira.entity.PermissionGroupEntity;
import com.example.Gira.exception.CustomException;
import com.example.Gira.payload.response.AcctStatResponse;
import com.example.Gira.payload.response.PermissionGroupResponse;
import com.example.Gira.repository.AcctStatRepository;
import com.example.Gira.service.Imp.AcctStatServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AcctStatService implements AcctStatServiceImp {
    @Autowired
    private AcctStatRepository acctStatRepository;
    @Override
    public List<AcctStatResponse> findAcctStatusResponse() {
        List<AcctStatResponse> responseList = new ArrayList<>();
        try {
            List<AcctStatEntity> list = acctStatRepository.findAll();
            for (AcctStatEntity entity: list) {
                AcctStatResponse response = new AcctStatResponse();
                response.setName(entity.getName());
                response.setId(entity.getId());
                responseList.add(response);
            }
        }catch (Exception e){
            throw new CustomException("Err findAcctStatusResponse: " + e.getMessage());
        }
        return responseList;
    }
}
