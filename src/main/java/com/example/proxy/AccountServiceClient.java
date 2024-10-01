package com.example.proxy;

import com.example.model.Account;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;

import java.math.BigDecimal;

@Client("http://localhost:8701/accounts")
public interface AccountServiceClient {

    @Get("/{accountId}")
    Account getAccountById(Long accountId);

    @Put("/{accountId}/balance")
    void updateAccountBalance(Long accountId, BigDecimal newBalance);
}
