package com._2p1team.cmapi.dto;

public record LeaderboardList(
    Long competitorId,
    Long competitionId,
    int placement
) {

    public LeaderboardList() {
        this(null, null, 0);
    }

}