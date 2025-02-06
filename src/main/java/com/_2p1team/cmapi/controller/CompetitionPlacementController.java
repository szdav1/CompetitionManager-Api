package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.model.CompetitionPlacement;
import com._2p1team.cmapi.service.CompetitionPlacementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placements")
@CrossOrigin(origins="http://localhost:3001") //ToDo: Delete after deployment
public class CompetitionPlacementController {

    private final CompetitionPlacementService service;

    @Autowired
    public CompetitionPlacementController(final CompetitionPlacementService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @Operation(summary="Get all the competitions and the placement the specified competitor has finished at")
    @ApiResponse(responseCode="404", description="Competitor with specified id not found")
    @ApiResponse(responseCode = "200", description = "{The competition placement object that has the specified id}")
    public List<CompetitionPlacement> getPlacementsByCompetitor(@PathVariable final Long id) {
        return this.service.getPlacementsByCompetitor(id);
    }

}