package com.sasianet.transaction_service_api.repository;


import com.sasianet.transaction_service_api.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface TransactionRepository extends JpaRepository<Transaction,String> {
    long countByTransactionReference(String transactionReference);
}
