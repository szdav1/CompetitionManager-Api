package com._2p1team.cmapi.service;

import com._2p1team.cmapi.exceptions.CompetitionNotFoundByIdException;
import com._2p1team.cmapi.model.Competition;
import com._2p1team.cmapi.model.CompetitionPlacement;
import com._2p1team.cmapi.model.Competitor;
import com._2p1team.cmapi.model.Leaderboard;
import com._2p1team.cmapi.repository.CompetitionRepository;
import com._2p1team.cmapi.repository.CompetitorRepository;
import com._2p1team.cmapi.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompetitionPlacementService {

    private final CompetitorRepository competitorRepository;
    private final CompetitionRepository competitionRepository;
    private final LeaderboardRepository leaderboardRepository;

    @Autowired
    public CompetitionPlacementService(final CompetitorRepository competitorRepository, final CompetitionRepository competitionRepository, final LeaderboardRepository leaderboardRepository) {
        this.competitorRepository = competitorRepository;
        this.competitionRepository = competitionRepository;
        this.leaderboardRepository = leaderboardRepository;
    }

    // WARNING: DO NOT CHANGE AT ANY TIME
    // TODO: Fix this method as it returns the values twice
    public List<CompetitionPlacement> getPlacementsByCompetitor(final Long competitorId) {
        List<CompetitionPlacement> placements = new ArrayList<>();

        Competitor competitor = this.competitorRepository.findById(competitorId)
            .orElseThrow(() -> new CompetitionNotFoundByIdException(String.format("Competitor with '%d' id not found", competitorId)));

        List<Competition> competitions = this.competitionRepository.findAll();
        List<Leaderboard> leaderboards = this.leaderboardRepository.findAll();

        List<Leaderboard> participatedLeaderboards = leaderboards.stream()
            .filter(leaderboard -> leaderboard.getCompetitorId().equals(competitorId))
            .toList();

        List<Competition> participatedCompetitions = new ArrayList<>();

        for (Leaderboard participatedLeaderboard : participatedLeaderboards) {
            for (Competition competition : competitions) {
                if (participatedLeaderboard.getCompetitionId().equals(competition.getId()))
                    participatedCompetitions.add(competition);
            }
        }

        for (Leaderboard participatedLeaderboard : participatedLeaderboards) {
            for (Competition participatedCompetition : participatedCompetitions) {
                placements.add(new CompetitionPlacement(competitor.getName(), participatedCompetition.getName(), participatedCompetition.getLocation(), participatedCompetition.getDate(), participatedLeaderboard.getPlacement()));
            }
        }

        return placements;
    }

}