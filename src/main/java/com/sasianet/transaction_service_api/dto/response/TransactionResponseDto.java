package com.sasianet.transaction_service_api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionResponseDto {

    private String refNo;
    private String vendorCode;
    private String transactionReference;
    private String customerMobile;
    private double transactionAmount;
    private String serviceCode;
    private String notes;
}
