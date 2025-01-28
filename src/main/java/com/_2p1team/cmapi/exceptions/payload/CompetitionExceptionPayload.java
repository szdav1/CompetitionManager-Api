package com._2p1team.cmapi.exceptions.payload;

import org.springframework.http.HttpStatus;

public record CompetitionExceptionPayload(
    String message,
    HttpStatus status
) {

}