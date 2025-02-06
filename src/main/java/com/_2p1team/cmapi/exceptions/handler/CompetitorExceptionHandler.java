package com._2p1team.cmapi.exceptions.handler;

import com._2p1team.cmapi.exceptions.CompetitorNotFoundByIdException;
import com._2p1team.cmapi.exceptions.payload.CompetitorExceptionPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CompetitorExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value={CompetitorNotFoundByIdException.class})
    public ResponseEntity<Object> handleCompetitorNotFoundByIdException(final CompetitorNotFoundByIdException exception) {
        return new ResponseEntity<>(new CompetitorExceptionPayload(exception.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

}