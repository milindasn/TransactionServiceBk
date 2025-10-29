package com.sasianet.transaction_service_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApplicationDetailsDto {
    private String applicationNo;
    private String clientCode;
    private long clientNo;
    private String inquaryNo;
    private String financeNo;
    private String entUser;
    private Date entDate;
    private String modUser;
    private Date modDate;
    private String applicationStatus;
    private String coApplicant;
    private String facilityNo;
    private long totalFinanceAmount;
    private long currentFinanceAmount;
    private String currencyCode;
    private String transactionType;
    private String alloStatus;
    private String allocatedTo;
    private String collectionOfficer;
    private Date assignDate;
    private String terStatus;
    private String terType;
    private Date terTypeEntDate;
    private String terTypeEntUser;
    private String clientStatus;
    private String guarantoStatus;
    private String pricingStatus;
    private String valuationStatus;
    private String proFormaStatus;
    private String assetStatus;
    private String terminationNo;
    private Date activatedDate;
    private String paymentStatus;
    private String insuranceDoneBy;
    private String postedName;
    private String postAddress1;
    private String postAddress2;
    private String telephone;
    private Date postedDate;
    private String previousStatus;
    private String priority;
    private String masterAgreementNo;
    private Date agreementDate;
    private String branchCode;
    private String preApplicationNo;
    private String leadSourceCategory;
    private String leadSourceName;
    private String divisionCode;
    private String remarks;
    private Date insuranceOfficerAssignDate;
    private String insuranceOfficer;
    private Date terminatedDate;
    private String refFinanceNo;
    private String performStat;
}
