package com._2p1team.cmapi.dto;

public record LeaderboardSave(
    Long competitionId,
    Long competitorId,
    int placement
) {

    public LeaderboardSave() {
        this(null, null, 0);
    }

}