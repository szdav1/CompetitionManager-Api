package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitorList(
    Long id,
    String name,
    String club,
    LocalDate birthDate
) {

    public CompetitorList() {
        this(null, "", "", null);
    }

}