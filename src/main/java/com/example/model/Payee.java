package com.example.model;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;

@Builder
@Introspected
public class Payee {

	private Long id;
	private String payeeName;
	private String accountNumber;
	private String address;

	public Payee() {
		super();
	}

	public Payee(Long id, String payeeName, String accountNumber, String address) {
		super();
		this.id = id;
		this.payeeName = payeeName;
		this.accountNumber = accountNumber;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
