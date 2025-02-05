package com._2p1team.cmapi.service;

import com._2p1team.cmapi.converter.LeaderboardConverter;
import com._2p1team.cmapi.dto.LeaderboardList;
import com._2p1team.cmapi.dto.LeaderboardRead;
import com._2p1team.cmapi.dto.LeaderboardSave;
import com._2p1team.cmapi.exceptions.LeaderboardNotFoundByIdException;
import com._2p1team.cmapi.model.Leaderboard;
import com._2p1team.cmapi.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * TODO: Fix Leaderboard table structure
 *  as it is inappropriate
 * */
@Service
public class LeaderboardService {

    private final LeaderboardRepository repository;

    @Autowired
    public LeaderboardService(final LeaderboardRepository repository) {
        this.repository = repository;
    }

    public List<LeaderboardList> findAll() {
        return LeaderboardConverter.convertModelsToList(this.repository.findAll());
    }

    public LeaderboardRead findLeaderboardById(final Long id) {
        Leaderboard leaderboard = this.repository.findById(id)
            .orElseThrow(() -> new LeaderboardNotFoundByIdException(String.format("Leaderboard with '%d' id not found", id)));

        return LeaderboardConverter.convertModelToRead(leaderboard);
    }

    public LeaderboardRead crateNewLeaderboard(final LeaderboardSave leaderboardSave) {
        Leaderboard leaderboard = this.repository.save(LeaderboardConverter.convertSaveToModel(leaderboardSave));

        return LeaderboardConverter.convertModelToRead(leaderboard);
    }

    public LeaderboardRead updateLeaderboard(final Long id, final LeaderboardSave leaderboardSave) {
        Leaderboard leaderboard = this.repository.findById(id)
            .orElseThrow(() -> new LeaderboardNotFoundByIdException(String.format("Leaderboard with '%d' id not found", id)));

        leaderboard.setCompetitionId(leaderboardSave.competitionId());
        leaderboard.setCompetitorId(leaderboardSave.competitorId());
        leaderboard.setPlacement(leaderboardSave.placement());

        this.repository.save(leaderboard);

        return LeaderboardConverter.convertModelToRead(leaderboard);
    }

}