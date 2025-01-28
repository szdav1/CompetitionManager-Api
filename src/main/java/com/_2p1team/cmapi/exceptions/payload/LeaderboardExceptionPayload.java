package com._2p1team.cmapi.exceptions.payload;

import org.springframework.http.HttpStatus;

public record LeaderboardExceptionPayload(
    String message,
    HttpStatus status
) {

}