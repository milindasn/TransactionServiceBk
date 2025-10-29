package com.sasianet.transaction_service_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionRequestDto {

//    private String providerDomain;
//    @NotBlank(message = "Reference id is mandatory")
//    private String cashRefId;
//    @NotBlank(message = "Mobile no is mandatory")
//    private String customerMobile;
//    @PositiveOrZero(message = "Amount must be greater than or equal to 0")
//    private double amount;
//    @NotBlank(message = "Account no is mandatory")
//    private String accountId;
//    @NotBlank(message = "Service id is mandatory")
//    private String serviceId;

    private String vendorCode;
    @NotBlank(message = "Reference id is mandatory")
    private String transactionReference;
    @NotBlank(message = "Mobile no is mandatory")
    @Pattern(regexp="(^$|[0-9]{10})",message = "please enter valid mobile no")
    private String customerMobile;
    @PositiveOrZero(message = "Amount must be greater than or equal to 0")
    private double transactionAmount;
    @NotBlank(message = "Id is mandatory")
    private String customerId;
    @NotBlank(message = "Service id is mandatory")
    private String serviceCode;
    private String notes;

}
