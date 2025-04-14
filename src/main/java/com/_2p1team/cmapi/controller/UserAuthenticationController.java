package com._2p1team.cmapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class UserAuthenticationController {

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary="Authenticate a user")
    @ApiResponse(responseCode="200", description="Authentication was successful")
    @ApiResponse(responseCode="401", description="Authentication failed")
    public String authenticateUser() {
        return "Login Successful";
    }

}