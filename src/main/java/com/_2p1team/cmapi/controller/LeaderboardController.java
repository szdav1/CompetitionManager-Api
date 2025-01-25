package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.LeaderboardList;
import com._2p1team.cmapi.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}