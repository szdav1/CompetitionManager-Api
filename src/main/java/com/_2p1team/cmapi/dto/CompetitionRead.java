package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitionRead(
    String name,
    String location,
    LocalDate date
) {
    public CompetitionRead() {
        this("", "", null);
    }
}