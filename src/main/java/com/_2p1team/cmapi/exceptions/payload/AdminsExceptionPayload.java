package com._2p1team.cmapi.exceptions.payload;

import org.springframework.http.HttpStatus;

public record AdminsExceptionPayload(
    String message,
    HttpStatus status
) {

}