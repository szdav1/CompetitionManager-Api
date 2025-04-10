package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.AdminsList;
import com._2p1team.cmapi.dto.AdminsSave;
import com._2p1team.cmapi.model.Admins;
import com._2p1team.cmapi.service.AdminsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Admins")
@RequestMapping("/api/admins")
public class AdminsController {

    private AdminsService service;

    @Autowired
    public AdminsController(AdminsService service) {
        this.service = service;
    }

    @GetMapping("/")
    @Operation(summary="Get all the admins from the database")
    public List<AdminsList> listAdmins() {
        return this.service.findAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary="Create a new admin")
    @ApiResponse(responseCode="200", description="{The created admin object}")
    public Admins createNewAdmin(@RequestBody AdminsSave adminsSave) {
        return this.service.saveNewAdmin(adminsSave);
    }

}