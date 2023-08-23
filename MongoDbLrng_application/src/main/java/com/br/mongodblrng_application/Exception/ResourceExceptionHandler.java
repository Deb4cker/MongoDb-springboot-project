package com.br.mongodblrng_application.Exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler{

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<StandardError> userNotFound(UserNotFoundException e, HttpServletRequest request){
        var status = HttpStatus.NOT_FOUND;
        return errorBody(e, status, request);
    }

    private ResponseEntity<StandardError> errorBody(Exception e, HttpStatus status, HttpServletRequest request){
        return ResponseEntity.status(status)
                .body(new StandardError(
                System.currentTimeMillis(),
                status.value(),
                e.getMessage(),
                request.getRequestURI()));
    }
}
