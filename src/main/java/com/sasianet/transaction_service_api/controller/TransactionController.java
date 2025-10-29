package com.sasianet.transaction_service_api.controller;



import com.sasianet.transaction_service_api.dto.TransactionRequestDto;
import com.sasianet.transaction_service_api.dto.response.TransactionResponseDto;
import com.sasianet.transaction_service_api.service.TransactionService;
import com.sasianet.transaction_service_api.util.StandardResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;


@RestController
@RequestMapping("api/v2/payment")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/savePayment")
    @Tag(name = "test2")
public ResponseEntity<StandardResponse>savePayment(@Valid @RequestBody TransactionRequestDto requestDto){
        String message= null;
        TransactionResponseDto responseDto= new TransactionResponseDto();
        //message=transactionService.saveTransaction(requestDto);
        responseDto=transactionService.saveTransaction(requestDto);
        //return new ResponseEntity<StandardResponse>(new StandardResponse("Transaction saved successfully",message,0), HttpStatus.OK);
        return new ResponseEntity<StandardResponse>(new StandardResponse(new Date(),0,"Transaction saved successfully", responseDto), HttpStatus.CREATED);
    }
}
