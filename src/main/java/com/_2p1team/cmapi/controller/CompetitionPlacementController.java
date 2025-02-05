package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.model.CompetitionPlacement;
import com._2p1team.cmapi.service.CompetitionPlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placements")
@CrossOrigin(origins="localhost:3000")
public class CompetitionPlacementController {

    private final CompetitionPlacementService service;

    @Autowired
    public CompetitionPlacementController(final CompetitionPlacementService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public List<CompetitionPlacement> getPlacementsByCompetitor(@PathVariable final Long id) {
        return this.service.getPlacementsByCompetitor(id);
    }

}