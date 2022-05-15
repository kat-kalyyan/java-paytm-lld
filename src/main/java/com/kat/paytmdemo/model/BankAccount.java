package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class BankAccount extends PaymentAccount {
    private long accountNumber;
    private long ifsc;
    private String upi;
}