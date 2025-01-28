package com._2p1team.cmapi.dto;

public record LeaderboardSave(
    Long competitorId,
    Long competitionId,
    int placement
) {

    public LeaderboardSave() {
        this(null, null, 0);
    }

}