package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.CompetitionList;
import com._2p1team.cmapi.dto.CompetitionRead;
import com._2p1team.cmapi.dto.CompetitionSave;
import com._2p1team.cmapi.service.CompetitionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/competition")
@CrossOrigin(origins="http://localhost:3001") //ToDo: Delete after deployment
public class CompetitionController {

    private final CompetitionService service;

    @Autowired
    public CompetitionController(CompetitionService service) {
        this.service = service;
    }

    @GetMapping("/")
    @Operation(summary="Get all the competitions from the database")
    // TODO
    public List<CompetitionList> listCompetitions() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary="Get the competition that has the specified id")
    @ApiResponse(responseCode="404", description="Competition with specified id not found")
    public CompetitionRead getCompetitionById(@PathVariable int id) {
        return this.service.findCompetitionById(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary="Create a new competition")
    @ApiResponse(responseCode="200", description="{The created competition object}")
    public CompetitionRead createNewCompetition(@RequestBody CompetitionSave competitionSave) {
        return this.service.saveNewCompetition(competitionSave);
    }

    @PutMapping("/update/{id}")
    @Operation(summary="Update competition with the specified id")
    @ApiResponse(responseCode="404", description="Competition with specified id not found")
    @ApiResponse(responseCode="200", description="{The updated competition object}")
    public CompetitionRead updateCompetition(@PathVariable final Long id, @RequestBody final CompetitionSave competitionSave) {
        return this.service.updateCompetition(id, competitionSave);
    }

}