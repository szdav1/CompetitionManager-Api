package com._2p1team.cmapi.converter;

import com._2p1team.cmapi.dto.LeaderboardList;
import com._2p1team.cmapi.dto.LeaderboardRead;
import com._2p1team.cmapi.dto.LeaderboardSave;
import com._2p1team.cmapi.model.Leaderboard;

import java.util.ArrayList;
import java.util.List;

public class LeaderboardConverter {

    public static List<LeaderboardList> convertModelsToList(final List<Leaderboard> leaderboards) {
        List<LeaderboardList> list = new ArrayList<>();
        leaderboards.forEach(leaderboard -> list.add(new LeaderboardList(leaderboard.getId(), leaderboard.getCompetitionId(), leaderboard.getCompetitorId(), leaderboard.getPlacement())));

        return list;
    }

    public static LeaderboardRead convertModelToRead(final Leaderboard leaderboard) {
        return new LeaderboardRead(leaderboard.getId(), leaderboard.getCompetitionId(), leaderboard.getCompetitorId(), leaderboard.getPlacement());
    }

    public static Leaderboard convertSaveToModel(final LeaderboardSave leaderboardSave) {
        return new Leaderboard(leaderboardSave.competitionId(), leaderboardSave.competitorId(), leaderboardSave.placement());
    }

}