package com.sasianet.transaction_service_api.adviser;


import com.sasianet.transaction_service_api.exception.DuplicateFoundException;
import com.sasianet.transaction_service_api.exception.IllegalArgumentExceptionException;
import com.sasianet.transaction_service_api.exception.NotFoundException;
import com.sasianet.transaction_service_api.exception.ResourceNotFoundException;
import com.sasianet.transaction_service_api.util.StandardResponse;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionAdviser extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {

        //Map<String, List<String>> body = new HashMap<>();

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timeStamp", new Date());
        body.put("Status", status.value());
        body.put("responseStatusDesc", "API Error");

        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());

        body.put("response", errors);

        //return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(body, headers, status);

    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> getExceptions(NotFoundException e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(new Date(),1,"API Error",e.getMessage())
                , HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(DuplicateFoundException.class)
    public ResponseEntity<StandardResponse>getException(DuplicateFoundException e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(new Date(),5,"API Error",e.getMessage())
                ,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(IllegalArgumentExceptionException.class)
    public ResponseEntity<StandardResponse>getException(IllegalArgumentExceptionException e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(new Date(),1,"API Error",e.getMessage())
                ,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardResponse>getException(ResourceNotFoundException e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(new Date(),1,"Invalid Reference",e.getMessage())
                ,HttpStatus.OK);

    }
}
