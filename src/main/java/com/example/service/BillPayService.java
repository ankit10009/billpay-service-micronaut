package com.example.service;

import jakarta.inject.Singleton;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Singleton
public class BillPayService {

    private final PaymentRepository paymentRepository;
    private final PayeeServiceClient payeeServiceClient;
    private final AccountServiceClient accountServiceClient;

    public BillPayService(PaymentRepository paymentRepository, PayeeServiceClient payeeServiceClient, AccountServiceClient accountServiceClient) {
        this.paymentRepository = paymentRepository;
        this.payeeServiceClient = payeeServiceClient;
        this.accountServiceClient = accountServiceClient;
    }

    public Payment makePayment(Long payeeId, Long accountId, BigDecimal amount) {
        // Validate payee
        Payee payee = payeeServiceClient.getPayeeById(payeeId);

        // Validate account and balance
        Account account = accountServiceClient.getAccountById(accountId);
        if (account.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient balance");
        }

        // Deduct the amount
        accountServiceClient.updateAccountBalance(accountId, account.getBalance().subtract(amount));

        // Record the payment
        Payment payment = new Payment();
        payment.setPayeeId(payeeId);
        payment.setAccountId(accountId);
        payment.setAmount(amount);
        payment.setPaymentDate(LocalDateTime.now());

        return paymentRepository.save(payment);
    }

    public List<Payment> getPaymentHistory() {
        return (List<Payment>) paymentRepository.findAll();
    }
}
