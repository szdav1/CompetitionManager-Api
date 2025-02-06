package com._2p1team.cmapi.exceptions.handler;

import com._2p1team.cmapi.exceptions.LeaderboardNotFoundByIdException;
import com._2p1team.cmapi.exceptions.payload.LeaderboardExceptionPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class LeaderboardExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(LeaderboardNotFoundByIdException.class)
    public ResponseEntity<Object> handleLeaderboardNotFoundByIdException(final LeaderboardNotFoundByIdException exception) {
        return new ResponseEntity<>(new LeaderboardExceptionPayload(exception.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

}