package com._2p1team.cmapi.exceptions.handler;

import com._2p1team.cmapi.exceptions.CompetitionNotFoundByIdException;
import com._2p1team.cmapi.exceptions.payload.CompetitionExceptionPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CompetitionExceptionHandler {
    @ExceptionHandler(CompetitionNotFoundByIdException.class)
    public ResponseEntity<Object> handleCompetitionNotFoundByIdException(final CompetitionNotFoundByIdException exception) {
        return new ResponseEntity<>(new CompetitionExceptionPayload(exception.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }
}