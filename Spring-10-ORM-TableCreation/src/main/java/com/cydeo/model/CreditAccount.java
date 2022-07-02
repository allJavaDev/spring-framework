package com.cydeo.model;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public class CreditAccount extends Account{
    private BigDecimal accountbalance;
}
