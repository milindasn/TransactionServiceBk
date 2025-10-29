package com.sasianet.transaction_service_api.service;


import com.sasianet.transaction_service_api.dto.TransactionRequestDto;
import com.sasianet.transaction_service_api.dto.response.TransactionResponseDto;

public interface TransactionService {
    TransactionResponseDto saveTransaction(TransactionRequestDto requestDto);
}
