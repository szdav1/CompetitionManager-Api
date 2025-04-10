package com._2p1team.cmapi.exceptions.handler;

import com._2p1team.cmapi.exceptions.UsernameAlreadyTakeException;
import com._2p1team.cmapi.exceptions.payload.AdminsExceptionPayload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AdminsExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(UsernameAlreadyTakeException.class)
    public ResponseEntity<Object> handleUsernameAlreadyTakenException(final UsernameAlreadyTakeException usernameAlreadyTakeException) {
        return new ResponseEntity<>(new AdminsExceptionPayload(usernameAlreadyTakeException.getMessage(), HttpStatus.CONFLICT), HttpStatus.CONFLICT);
    }

}