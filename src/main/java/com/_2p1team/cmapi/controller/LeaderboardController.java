package com._2p1team.cmapi.controller;

import com._2p1team.cmapi.dto.LeaderboardList;
import com._2p1team.cmapi.dto.LeaderboardRead;
import com._2p1team.cmapi.dto.LeaderboardSave;
import com._2p1team.cmapi.service.LeaderboardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
@CrossOrigin(origins="http://localhost:3001") //ToDo: Delete after deployment
public class LeaderboardController {

    private final LeaderboardService service;

    @Autowired
    public LeaderboardController(final LeaderboardService service) {
        this.service = service;
    }

    @GetMapping("/")
    @Operation(summary="Get all the leaderboard elements from the database")
    @ApiResponse(responseCode="200", description="{A list of the leaderboard elements from the database}")
    public List<LeaderboardList> listLeaderboard() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary="Get the leaderboard element with the specified id")
    @ApiResponse(responseCode="404", description="Leaderboard element with specified id not found")
    @ApiResponse(responseCode="200", description="The leaderboard element with the specified id")
    public LeaderboardRead findLeaderboardById(@PathVariable final Long id) {
        return this.service.findLeaderboardById(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary="Create a new leaderboard element")
    @ApiResponse(responseCode="200", description = "{The created leaderboard object}")
    public LeaderboardRead createNewLeaderboard(@RequestBody final LeaderboardSave leaderboardSave) {
        return this.service.crateNewLeaderboard(leaderboardSave);
    }

    @PutMapping("/update/{id}")
    @Operation(summary="Update leaderboard with the specified id")
    @ApiResponse(responseCode="404", description="Leaderboard element with specified id not found")
    @ApiResponse(responseCode="200", description="{The updated leaderboard element object}")
    public LeaderboardRead updateLeaderboard(@PathVariable final Long id, @RequestBody final LeaderboardSave leaderboardSave) {
        return this.service.updateLeaderboard(id, leaderboardSave);
    }

}