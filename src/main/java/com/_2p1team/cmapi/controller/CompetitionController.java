package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.CompetitionList;
import com._2p1team.cmapi.dto.CompetitionRead;
import com._2p1team.cmapi.dto.CompetitionSave;
import com._2p1team.cmapi.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/competition")
public class CompetitionController {
    private final CompetitionService service;

    @Autowired
    public CompetitionController(CompetitionService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<CompetitionList> listCompetitions() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public CompetitionRead getCompetitionById(@PathVariable int id) {
        return this.service.findCompetitionById(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public CompetitionRead createNewCompetition(@RequestBody CompetitionSave competitionSave) {
        return this.service.saveNewCompetition(competitionSave);
    }
}