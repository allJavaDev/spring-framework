package com.alljavadev.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Table(name="merchants")
@Entity
@Data
@NoArgsConstructor
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String code;
    @Column
    private BigDecimal transactionFee;
    @Column
    private BigDecimal commissionRate;
    @Column
    private Integer payoutDelayCount;

    @OneToMany (mappedBy = "merchant")
    private List<Payment> paymentList;

    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, Integer payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }
}
