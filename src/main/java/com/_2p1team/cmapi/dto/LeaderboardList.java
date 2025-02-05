package com._2p1team.cmapi.dto;

public record LeaderboardList(
    Long id,
    Long competitionId,
    Long competitorId,
    int placement
) {

    public LeaderboardList() {
        this(null, null, null, 0);
    }

}