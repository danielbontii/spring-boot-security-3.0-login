package com.springsecnew.service;

import com.springsecnew.dto.AuthRequest;

public interface AuthService {
    String authenticate(AuthRequest authRequest);
}
