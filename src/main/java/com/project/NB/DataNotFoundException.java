package com.project.NB;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNotFoundException extends RuntimeException{
    private static final long seriaVersionUID = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }
}
