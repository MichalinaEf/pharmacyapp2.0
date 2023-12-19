package com.michalinaef.pharmacyapp.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(RuntimeException.class)
    private String handleRuntimeException(RuntimeException exception){
        return "Error";
    }
}
