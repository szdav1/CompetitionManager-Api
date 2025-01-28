package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitorRead(
    Long id,
    String name,
    String club,
    LocalDate birthDate
) {

    public CompetitorRead() {
        this(null, "", "", null);
    }

}