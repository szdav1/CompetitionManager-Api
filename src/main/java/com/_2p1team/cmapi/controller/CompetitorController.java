package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.CompetitorList;
import com._2p1team.cmapi.dto.CompetitorRead;
import com._2p1team.cmapi.dto.CompetitorSave;
import com._2p1team.cmapi.service.CompetitorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/competitor")
@CrossOrigin(origins="http://localhost:3001") //ToDo: Delete after deployment
public class CompetitorController {

    private final CompetitorService service;

    @Autowired
    public CompetitorController(final CompetitorService service) {
        this.service = service;
    }

    @GetMapping("/")
    @Operation(summary="Get all the competitors from the database")
    @ApiResponse(responseCode="200", description="{A list of the competitors from the database}")
    public List<CompetitorList> listCompetitors() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary="Get the competitor that has the specified id")
    @ApiResponse(responseCode="404", description="Competitor with specified id not found")
    public CompetitorRead getCompetitorById(@PathVariable Long id) {
        return this.service.findCompetitorById(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary="Create a new competitor")
    @ApiResponse(responseCode="200", description="{The created competitor object}")
    public CompetitorRead createNewCompetitor(@RequestBody CompetitorSave competitorSave) {
        return this.service.saveNewCompetitor(competitorSave);
    }

    @PutMapping("/update/{id}")
    @Operation(summary="Update competitor with the specified id")
    @ApiResponse(responseCode="404", description="Competitor with specified id not found")
    @ApiResponse(responseCode="200", description="{The updated competitor object}")
    public CompetitorRead updateCompetitor(@PathVariable final Long id, @RequestBody CompetitorSave competitorSave) {
        return this.service.updateCompetitor(id, competitorSave);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary="Delete competitor with the specified id")
    @ApiResponse(responseCode="404", description="Competitor with specified id not found")
    @ApiResponse(responseCode="204", description="Competitor deleted successfully")
    public void deleteCompetitor(@PathVariable final Long id) {
        this.service.deleteCompetitor(id);
    }

}