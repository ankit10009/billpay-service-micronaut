package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;

@Introspected
@Entity
@Table(name = "payments")
@Builder
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long payeeId;
	private Long accountId;
	private BigDecimal amount;
	private LocalDateTime paymentDate;

	public Payment() {
		super();
	}

	public Payment(Long id, Long payeeId, Long accountId, BigDecimal amount, LocalDateTime paymentDate) {
		super();
		this.id = id;
		this.payeeId = payeeId;
		this.accountId = accountId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(Long payeeId) {
		this.payeeId = payeeId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

}
