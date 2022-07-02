package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table (name="payment_details")
@Entity (name="Payment_Details")
@Data
@NoArgsConstructor
public class PaymentDetail {
    @OneToOne(mappedBy = "paymentDetail", cascade=CascadeType.ALL)
    @JoinColumn(name="payment_id")
    private Payment payment;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_detail_id")
    private Long id;


    @Column(name="commission_amount")
    private BigDecimal commissionAmount;

    @Column(name="merchant_payout_amount")
    private BigDecimal merchantPayoutAmount;

    @Column(name="payout_date", columnDefinition = "DATE")
    private LocalDate payoutDate;

    public PaymentDetail(BigDecimal commissionAmount, BigDecimal merchantPayoutAmount, LocalDate payoutDate) {
        this.commissionAmount = commissionAmount;
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.payoutDate = payoutDate;
    }
}
