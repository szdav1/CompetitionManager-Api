package com._2p1team.cmapi.dto;

import java.time.LocalDate;

public record CompetitionSave(
    String name,
    String location,
    LocalDate date
) {

}