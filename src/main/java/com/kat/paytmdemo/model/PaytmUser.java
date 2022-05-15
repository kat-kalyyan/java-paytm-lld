package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class PaytmUser extends BaseModel {
    @OneToOne
    private Identity identity;
    private String firstName;
    private String lastName;
    @OneToOne
    private Wallet wallet;
    @OneToMany
    private List<BankAccount> bankAccounts;
    @OneToMany
    private List<Card> cards;
}