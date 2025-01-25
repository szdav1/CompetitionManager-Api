package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitorRead(
    String name,
    String club,
    LocalDate birthDate
) {
    public CompetitorRead() {
        this("", "", null);
    }
}