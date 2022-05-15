package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Card extends PaymentAccount {
    private long cardNumber;
    private String nameOnCard;
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    private Date issuedAt;
    private Date expiryAt;
}