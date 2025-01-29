package com._2p1team.cmapi.dto;

public record LeaderboardRead(
    Long id,
    Long competitorId,
    Long competitionId,
    int placement
) {

    public LeaderboardRead() {
        this(null, null, null, 0);
    }

}