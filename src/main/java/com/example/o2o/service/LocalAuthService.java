package com.example.o2o.service;

import com.example.o2o.entity.Local_auth;

public interface LocalAuthService {
    Local_auth login(Local_auth localAuth);
    Local_auth getUserById(String userName);
}
