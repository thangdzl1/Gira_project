package com.example.Gira.service.Imp;

import com.example.Gira.payload.response.AcctStatResponse;

import java.util.List;

public interface AcctStatServiceImp {
    List<AcctStatResponse> findAcctStatusResponse();
}
