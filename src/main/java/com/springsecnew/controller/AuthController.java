package com.springsecnew.controller;

import com.springsecnew.dto.AuthRequest;
import com.springsecnew.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        return authService.authenticate(authRequest);
    }
}
