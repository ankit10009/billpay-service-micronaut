package com.example.model;

import java.math.BigDecimal;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;

@Builder
@Introspected
public class Account {

	private Long id;
	private String accountNumber;
	private BigDecimal balance;
	private String status;

	public Account() {
		super();
	}

	public Account(Long id, String accountNumber, BigDecimal balance, String status) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
