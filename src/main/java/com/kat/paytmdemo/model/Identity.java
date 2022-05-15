package com.kat.paytmdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Identity extends BaseModel {
    @Enumerated(EnumType.STRING)
    private IdentityStatus identityStatus;
    private Timestamp lastLoggedOn;
}