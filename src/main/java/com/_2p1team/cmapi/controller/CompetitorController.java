package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.CompetitorList;
import com._2p1team.cmapi.dto.CompetitorRead;
import com._2p1team.cmapi.dto.CompetitorSave;
import com._2p1team.cmapi.service.CompetitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/competitor")
@CrossOrigin(origins = "http://localhost:3001") //ToDo: Delete after deployment
public class CompetitorController {

    private final CompetitorService service;

    @Autowired
    public CompetitorController(final CompetitorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<CompetitorList> listCompetitors() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public CompetitorRead getCompetitorById(@PathVariable Long id) {
        return this.service.findCompetitorById(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public CompetitorRead createNewCompetitor(@RequestBody CompetitorSave competitorSave) {
        return this.service.saveNewCompetitor(competitorSave);
    }

    @PutMapping("/update/{id}")
    public CompetitorRead updateCompetitor(@PathVariable final Long id, @RequestBody CompetitorSave competitorSave) {
        return this.service.updateCompetitor(id, competitorSave);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCompetitor(@PathVariable final Long id) {
        this.service.deleteCompetitor(id);
    }

}