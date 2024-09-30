package com.example.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller("/billpay")
public class BillPayController {

    private final BillPayService billPayService;

    public BillPayController(BillPayService billPayService) {
        this.billPayService = billPayService;
    }

    @Post("/payments")
    public HttpResponse<Payment> makePayment(@Body PaymentRequest paymentRequest) {
        return HttpResponse.created(billPayService.makePayment(paymentRequest.getPayeeId(), paymentRequest.getAccountId(), paymentRequest.getAmount()));
    }

    @Get("/payments/history")
    public HttpResponse<List<Payment>> getPaymentHistory() {
        return HttpResponse.ok(billPayService.getPaymentHistory());
    }
}

