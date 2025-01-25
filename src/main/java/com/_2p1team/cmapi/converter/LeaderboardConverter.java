package com._2p1team.cmapi.converter;

import com._2p1team.cmapi.dto.LeaderboardList;
import com._2p1team.cmapi.model.Leaderboard;

import java.util.ArrayList;
import java.util.List;

public class LeaderboardConverter {
    public static List<LeaderboardList> convertModelsToList(final List<Leaderboard> leaderboards) {
        List<LeaderboardList> list = new ArrayList<>();
        leaderboards.forEach(leaderboard -> list.add(new LeaderboardList(leaderboard.getCompetitionId(), leaderboard.getCompetitorId(), leaderboard.getPlacement())));

        return list;
    }
}