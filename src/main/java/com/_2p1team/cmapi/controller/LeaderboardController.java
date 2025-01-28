package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.LeaderboardList;
import com._2p1team.cmapi.dto.LeaderboardRead;
import com._2p1team.cmapi.dto.LeaderboardSave;
import com._2p1team.cmapi.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
public class LeaderboardController {

    private final LeaderboardService service;

    @Autowired
    public LeaderboardController(final LeaderboardService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<LeaderboardList> listLeaderboard() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public LeaderboardRead findLeaderboardById(@PathVariable final Long id) {
        return this.service.findLeaderboardById(id);
    }

    @PostMapping("/new")
    public LeaderboardRead createNewLeaderboard(@RequestBody final LeaderboardSave leaderboardSave) {
        return this.service.crateNewLeaderboard(leaderboardSave);
    }

}