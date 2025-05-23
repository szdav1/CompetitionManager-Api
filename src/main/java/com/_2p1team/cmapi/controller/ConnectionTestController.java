package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.model.ConnectionTest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name="Connection Test")
@RequestMapping("/api/test")
public class ConnectionTestController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @Operation(summary="End point to test connection between the API and other applications")
    @ApiResponse(responseCode="200", description="{A connection test object}")
    public ConnectionTest testConnection() {
        return new ConnectionTest("Connection established");
    }

}