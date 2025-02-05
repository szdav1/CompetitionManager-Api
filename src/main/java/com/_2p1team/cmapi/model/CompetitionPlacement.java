package com._2p1team.cmapi.model;

import java.time.LocalDate;

public class CompetitionPlacement {

    private String competitorName;
    private String competitionName;
    private String competitionLocation;
    private LocalDate competitionDate;
    private Integer competitorPlacement;

    public CompetitionPlacement(String competitorName, String competitionName, String competitionLocation, LocalDate competitionDate, Integer competitorPlacement) {
        this.competitorName = competitorName;
        this.competitionName = competitionName;
        this.competitionLocation = competitionLocation;
        this.competitionDate = competitionDate;
        this.competitorPlacement = competitorPlacement;
    }

    public String getCompetitorName() {
        return this.competitorName;
    }

    public void setCompetitorName(String competitorName) {
        this.competitorName = competitorName;
    }

    public String getCompetitionName() {
        return this.competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionLocation() {
        return this.competitionLocation;
    }

    public void setCompetitionLocation(String competitionLocation) {
        this.competitionLocation = competitionLocation;
    }

    public LocalDate getCompetitionDate() {
        return this.competitionDate;
    }

    public void setCompetitionDate(LocalDate competitionDate) {
        this.competitionDate = competitionDate;
    }

    public Integer getCompetitorPlacement() {
        return this.competitorPlacement;
    }

    public void setCompetitorPlacement(Integer competitorPlacement) {
        this.competitorPlacement = competitorPlacement;
    }

    @Override
    public String toString() {
        return "CompetitionPlacement{"+
            "competitorName='"+competitorName+'\''+
            ", competitionName='"+competitionName+'\''+
            ", competitionLocation='"+competitionLocation+'\''+
            ", competitionDate="+competitionDate+
            ", competitorPlacement="+competitorPlacement+
            '}';
    }

}