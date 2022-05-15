package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Transaction extends BaseModel {
    @ManyToOne
    private PaytmUser sender;
    @ManyToOne
    private PaymentAccount receiver;
    private double amount;
    @Enumerated
    private TransactionStatus status;
}