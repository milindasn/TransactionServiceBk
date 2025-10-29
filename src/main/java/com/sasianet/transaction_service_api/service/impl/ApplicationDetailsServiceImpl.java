package com.sasianet.transaction_service_api.service.impl;

import com.sasianet.transaction_service_api.dto.ApplicationDetailsDto;
import com.sasianet.transaction_service_api.entity.ApplicationDetails;
import com.sasianet.transaction_service_api.exception.ResourceNotFoundException;
import com.sasianet.transaction_service_api.repository.AppicationDetailsRepository;
import com.sasianet.transaction_service_api.service.ApplicationDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ApplicationDetailsServiceImpl implements ApplicationDetailService {

    @Autowired
    private AppicationDetailsRepository appicationDetailsRepository;
    @Override
    //@Cacheable("ApplicationDetails")
    public String checkAvailibility(String financeNo) {
        ApplicationDetails applicationDetails = new ApplicationDetails();
        //applicationDetails = appicationDetailsRepository.findByFinanceNo(financeNo);
        System.out.println("*************"+appicationDetailsRepository.countByFinanceNo(financeNo));
        if (appicationDetailsRepository.countByFinanceNo(financeNo)>0){
            return financeNo;
        }else{
            throw new ResourceNotFoundException(financeNo);
        }

    }
}
