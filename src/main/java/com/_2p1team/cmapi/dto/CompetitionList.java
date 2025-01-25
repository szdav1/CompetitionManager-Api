package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitionList(
    String name,
    String location,
    LocalDate date
) {
    public CompetitionList() {
        this("", "", null);
    }
}