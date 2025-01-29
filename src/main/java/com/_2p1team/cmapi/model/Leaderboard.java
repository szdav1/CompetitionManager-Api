package com._2p1team.cmapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Leaderboard")
public class Leaderboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long competitorId;
    private Long competitionId;
    private int placement;

    public Leaderboard() {
    }

    public Leaderboard(Long competitorId, Long competitionId, int placement) {
        this.competitorId = competitorId;
        this.competitionId = competitionId;
        this.placement = placement;
    }

    public Leaderboard(Long id, Long competitionId, Long competitorId, int placement) {
        this.id = id;
        this.competitionId = competitionId;
        this.competitorId = competitorId;
        this.placement = placement;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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