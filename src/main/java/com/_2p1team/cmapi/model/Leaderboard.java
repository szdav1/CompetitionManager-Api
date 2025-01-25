package com._2p1team.cmapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Leaderboard")
public class Leaderboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long competitionId;
    @JoinColumn(name = "competitor_id")
    private Long competitorId;
    private int placement;

    public Leaderboard() {
    }

    public Leaderboard(Long competitionId, Long competitorId, int placement) {
        this.competitionId = competitionId;
        this.competitorId = competitorId;
        this.placement = placement;
    }

    public Long getCompetitionId() {
        return this.competitionId;
    }

    public void setCompetitionId(Long competitionId) {
        this.competitionId = competitionId;
    }

    public Long getCompetitorId() {
        return this.competitorId;
    }

    public void setCompetitorId(Long competitorId) {
        this.competitorId = competitorId;
    }

    public int getPlacement() {
        return this.placement;
    }

    public void setPlacement(int placement) {
        this.placement = placement;
    }
}