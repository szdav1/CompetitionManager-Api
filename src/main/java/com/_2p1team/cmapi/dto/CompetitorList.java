package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitorList(
    String name,
    String club,
    LocalDate birthDate
) {
    public CompetitorList() {
        this("", "", null);
    }
}