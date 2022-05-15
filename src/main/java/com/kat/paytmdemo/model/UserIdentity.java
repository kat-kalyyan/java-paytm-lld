package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class UserIdentity extends Identity {
    private String userName;
    private String hashedPassword;
}