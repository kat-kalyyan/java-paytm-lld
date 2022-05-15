package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Transaction extends BaseModel {
    @ManyToOne
    private PaytmUser sender;
    @ManyToOne
    private PaymentAccount senderAccount;
    @ManyToOne
    private PaymentAccount receiverAccount;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
    @Enumerated(EnumType.STRING)
    private TransactionCategory category;
}