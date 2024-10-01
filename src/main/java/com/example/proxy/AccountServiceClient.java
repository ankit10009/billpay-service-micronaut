package com.example.proxy;

import com.example.model.Account;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;

import java.math.BigDecimal;

@Client("http://localhost:8701/accounts")
public interface AccountServiceClient {

    @Get("/{accountId}")
    Account getAccountById(@PathVariable Long accountId);

    @Put("/{accountId}/balance")
    @Header(name = "Content-Type", value = "application/json")
    void updateAccountBalance(@PathVariable Long accountId, @Body BigDecimal newBalance);
}
