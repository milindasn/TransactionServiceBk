package com.sasianet.transaction_service_api.service.impl;



import com.sasianet.transaction_service_api.dto.TransactionRequestDto;
import com.sasianet.transaction_service_api.dto.response.TransactionResponseDto;
import com.sasianet.transaction_service_api.entity.Transaction;
import com.sasianet.transaction_service_api.exception.DuplicateFoundException;
import com.sasianet.transaction_service_api.repository.TransactionRepository;
import com.sasianet.transaction_service_api.service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository mobileCashTransactioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override

    public TransactionResponseDto saveTransaction(TransactionRequestDto requestDto) {
        Transaction cashTransaction=modelMapper.map(requestDto, Transaction.class);

        if(mobileCashTransactioRepository.countByTransactionReference(requestDto.getTransactionReference())==0){
            Transaction transaction=mobileCashTransactioRepository.saveAndFlush(cashTransaction);
            transaction=mobileCashTransactioRepository.getReferenceById(transaction.getRefNo());
            TransactionResponseDto responseDto=modelMapper.map(transaction,TransactionResponseDto.class);
            return responseDto;//cashTransaction.getRefNo();
        }else{
            throw new DuplicateFoundException(requestDto.getTransactionReference()+" : Already exists.");
        }



    }
}
