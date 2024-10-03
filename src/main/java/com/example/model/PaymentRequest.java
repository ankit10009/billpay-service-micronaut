package com.example.model;

import java.math.BigDecimal;

public class PaymentRequest {
	private Long payeeId;
	private Long accountId;
	private BigDecimal amount;

	public PaymentRequest() {
		super();
	}

	public PaymentRequest(Long payeeId, Long accountId, BigDecimal amount) {
		super();
		this.payeeId = payeeId;
		this.accountId = accountId;
		this.amount = amount;
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

}
