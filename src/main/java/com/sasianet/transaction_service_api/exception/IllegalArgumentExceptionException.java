package com.sasianet.transaction_service_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IllegalArgumentExceptionException extends RuntimeException{
    public IllegalArgumentExceptionException(String message){
        super(message);

    }
}
