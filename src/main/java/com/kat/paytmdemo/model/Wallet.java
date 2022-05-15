package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Wallet extends PaymentAccount {
    private long phoneNumber;
    private double availableBalance;
}