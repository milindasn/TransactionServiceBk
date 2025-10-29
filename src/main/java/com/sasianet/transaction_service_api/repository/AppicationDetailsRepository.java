package com.sasianet.transaction_service_api.repository;

import com.sasianet.transaction_service_api.entity.ApplicationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AppicationDetailsRepository extends JpaRepository<ApplicationDetails,String> {
    boolean findByFinanceNo(String financeNo);
    long countByFinanceNo(String financeNo);
}
