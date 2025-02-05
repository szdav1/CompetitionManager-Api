package com._2p1team.cmapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="Leaderboard")
public class Leaderboard {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long competitionId;
    private Long competitorId;
    private int placement;

    public Leaderboard() {
    }

    public Leaderboard(Long id, Long competitionId, Long competitorId, int placement) {
        this.id = id;
        this.competitionId = competitionId;
        this.competitorId = competitorId;
        this.placement = placement;
    }

    public Leaderboard(Long competitionId, Long competitorId, int placement) {
        this.competitionId = competitionId;
        this.competitorId = competitorId;
        this.placement = placement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Long competitionId) {
        this.competitionId = competitionId;
    }

    public Long getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(Long competitorId) {
        this.competitorId = competitorId;
    }

    public int getPlacement() {
        return placement;
    }

    public void setPlacement(int placement) {
        this.placement = placement;
    }

    @Override
    public String toString() {
        return "Leaderboard{"+
            "id="+id+
            ", competitorId="+competitorId+
            ", competitionId="+competitionId+
            ", placement="+placement+
            '}';
    }

}