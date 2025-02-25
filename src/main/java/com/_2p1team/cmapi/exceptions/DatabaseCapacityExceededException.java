package com._2p1team.cmapi.exceptions;

public final class DatabaseCapacityExceededException extends RuntimeException {

    public DatabaseCapacityExceededException(String message) {
        super(message);
    }

}