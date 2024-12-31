package com.example.AttachNet.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ValidationExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleInvalidArguments(MethodArgumentNotValidException er){
        Map<String,String> errorMap=new HashMap<>();
        er.getBindingResult().getFieldErrors().forEach((err)->{
            errorMap.put(err.getField(),err.getDefaultMessage());
        });
        return errorMap;
    }


}
