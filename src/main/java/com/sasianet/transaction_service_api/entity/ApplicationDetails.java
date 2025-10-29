package com.sasianet.transaction_service_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AF_CO_PRO_APPLICATION_DETAILS")
public class ApplicationDetails {
    @Id
    @Column(name = "APPLICATION_NO")
    private String applicationNo;
    @Column(name = "CLIENT_CODE")
    private String clientCode;
    @Column(name = "CLIENT_NO")
    private long clientNo;
    @Column(name = "INQUARY_NO")
    private String inquaryNo;
    @Column(name = "FINANCE_NO")
    private String financeNo;
    @Column(name = "ENT_USER")
    private String entUser;
    @Column(name = "ENT_DATE")
    private Date entDate;
    @Column(name = "MOD_USER")
    private String modUser;
    @Column(name = "MOD_DATE")
    private Date modDate;
    @Column(name = "APPLICATION_STATUS")
    private String applicationStatus;
    @Column(name = "CO_APPLICANT")
    private String coApplicant;
    @Column(name = "FACILITY_NO")
    private String facilityNo;
    @Column(name = "TOTAL_FINANCE_AMOUNT")
    private long totalFinanceAmount;
    @Column(name = "CURRENT_FINANCE_AMOUNT")
    private long currentFinanceAmount;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "ALLO_STATUS")
    private String alloStatus;
    @Column(name = "ALLOCATED_TO")
    private String allocatedTo;
    @Column(name = "COLLECTION_OFFICER")
    private String collectionOfficer;
    @Column(name = "ASSIGN_DATE")
    private Date assignDate;
    @Column(name = "TER_STATUS")
    private String terStatus;
    @Column(name = "TER_TYPE")
    private String terType;
    @Column(name = "TER_TYPE_ENT_DATE")
    private Date terTypeEntDate;
    @Column(name = "TER_TYPE_ENT_USER")
    private String terTypeEntUser;
    @Column(name = "CLIENT_STATUS")
    private String clientStatus;
    @Column(name = "GUARANTO_STATUS")
    private String guarantoStatus;
    @Column(name = "PRICING_STATUS")
    private String pricingStatus;
    @Column(name = "VALUATION_STATUS")
    private String valuationStatus;
    @Column(name = "PRO_FORMA_STATUS")
    private String proFormaStatus;
    @Column(name = "ASSET_STATUS")
    private String assetStatus;
    @Column(name = "TERMINATION_NO")
    private String terminationNo;
    @Column(name = "ACTIVATED_DATE")
    private Date activatedDate;
    @Column(name = "PAYMENT_STATUS")
    private String paymentStatus;
    @Column(name = "INSURANCE_DONE_BY")
    private String insuranceDoneBy;
    @Column(name = "POSTED_NAME")
    private String postedName;
    @Column(name = "POST_ADDRESS1")
    private String postAddress1;
    @Column(name = "POST_ADDRESS2")
    private String postAddress2;
    @Column(name = "TELEPHONE")
    private String telephone;
    @Column(name = "POSTED_DATE")
    private Date postedDate;
    @Column(name = "PREVIOUS_STATUS")
    private String previousStatus;
    @Column(name = "PRIORITY")
    private String priority;
    @Column(name = "MASTER_AGREEMENT_NO")
    private String masterAgreementNo;
    @Column(name = "AGREEMENT_DATE")
    private Date agreementDate;
    @Column(name = "BRANCH_CODE")
    private String branchCode;
    @Column(name = "PRE_APPLICATION_NO")
    private String preApplicationNo;
    @Column(name = "LEAD_SOURCE_CATEGORY")
    private String leadSourceCategory;
    @Column(name = "LEAD_SOURCE_NAME")
    private String leadSourceName;
    @Column(name = "DIVISION_CODE")
    private String divisionCode;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "INSURANCE_OFFICER_ASSIGN_DATE")
    private Date insuranceOfficerAssignDate;
    @Column(name = "INSURANCE_OFFICER")
    private String insuranceOfficer;
    @Column(name = "TERMINATED_DATE")
    private Date terminatedDate;
    @Column(name = "REF_FINANCE_NO")
    private String refFinanceNo;
    @Column(name = "PERFORM_STAT")
    private String performStat;
}
