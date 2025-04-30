package com.utm.codes.studentsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleEmployeeNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getErrMsg(), HttpStatus.NOT_FOUND);
    }
}
