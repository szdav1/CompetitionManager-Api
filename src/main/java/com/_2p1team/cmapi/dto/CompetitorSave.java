package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitorSave(
    String name,
    String club,
    LocalDate birthDate
) {
    public CompetitorSave() {
        this("", "", null);
    }
}