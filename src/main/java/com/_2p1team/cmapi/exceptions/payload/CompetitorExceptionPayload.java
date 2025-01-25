package com._2p1team.cmapi.exceptions.payload;

import org.springframework.http.HttpStatus;

public record CompetitorExceptionPayload(String message, HttpStatus status) {
}