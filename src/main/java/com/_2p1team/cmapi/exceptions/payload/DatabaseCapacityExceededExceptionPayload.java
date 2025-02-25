package com._2p1team.cmapi.exceptions.payload;

import org.springframework.http.HttpStatus;

public record DatabaseCapacityExceededExceptionPayload(
    String message,
    HttpStatus status
) {

}