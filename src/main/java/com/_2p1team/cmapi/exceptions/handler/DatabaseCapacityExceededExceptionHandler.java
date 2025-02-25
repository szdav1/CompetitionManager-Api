package com._2p1team.cmapi.exceptions.handler;

import com._2p1team.cmapi.exceptions.DatabaseCapacityExceededException;
import com._2p1team.cmapi.exceptions.payload.DatabaseCapacityExceededExceptionPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public final class DatabaseCapacityExceededExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(value={DatabaseCapacityExceededException.class})
    public ResponseEntity<Object> handleDatabaseCapacityExceededException(final DatabaseCapacityExceededException databaseCapacityExceededException) {
        return new ResponseEntity<>(new DatabaseCapacityExceededExceptionPayload(databaseCapacityExceededException.getMessage(), HttpStatus.CONFLICT), HttpStatus.CONFLICT);
    }

}