package com.example.controller;

import com.example.model.Payment;
import com.example.model.PaymentRequest;
import com.example.service.BillPayService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;

@ExecuteOn(TaskExecutors.BLOCKING)
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

