package com.sasianet.transaction_service_api.entity;

import com.sasianet.transaction_service_api.util.UserIdGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRANSACTION_API_DATA")
public class Transaction {
    @Id
    @GenericGenerator(name = "EZCASH_ID", strategy = "com.sasianet.transaction_service_api.util.UserIdGenerator", parameters = {
            @org.hibernate.annotations.Parameter(name = UserIdGenerator.VALUE_PREFIX_PARAMETER, value = "MC"),
            //@org.hibernate.annotations.Parameter(name = UserIdGenerator.DATE_FORMAT_PARAMETER, value = ""),
            @org.hibernate.annotations.Parameter(name = UserIdGenerator.DATE_NUMBER_SEPARATOR_PARAMETER, value = "-"),
            @org.hibernate.annotations.Parameter(name = UserIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EZCASH_ID")
    @Column(name = "REF_NO",nullable = false,unique=true)
    private String refNo;
    @Column(name = "PROVIDER_DOMAIN",nullable = false)
    private String vendorCode;
    @Column(name = "TRANSACTION_REF_ID",nullable = false,unique=true)
    private String transactionReference;
    @Column(name = "CUSTOMER_MOBILE",nullable = false)
    private String customerMobile;
    @Column(name = "AMOUNT",nullable = false)
    private double transactionAmount;
    @Column(name = "SERVICE_CHARGE")
    private double serviceCharge;
    @Column(name = "ACCOUNT_ID",nullable = false)
    private String customerId;
    @Column(name = "ENT_DATE")
    @CreationTimestamp
    private Date entDate;
    @Column(name = "UPDATED_STATUS")
    private String updatedStatus;
    @Column(name = "REC_NO")
    private String recNo;
    @Column(name = "ERROR_TEXT")//, columnDefinition ="VARCHAR2(50) default '-'"
    private String errorText;
    @Column(name = "COMMISSION_RATE")
    private double commissionRate;
    @Column(name = "COMMISSION_AMOUNT")
    private double commissionAmount;
    @Column(name = "NET_RECEIPT_AMOUNT")
    private String netReceiptAmount;
    @Column(name = "SERVICE_ID",nullable = false)
    private String serviceCode;
    private String notes;
}
