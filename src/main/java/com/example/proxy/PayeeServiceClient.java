package com.example.proxy;

import com.example.model.Payee;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client("http://localhost:8703/payees")
public interface PayeeServiceClient {

    @Get("/{payeeId}")
    Payee getPayeeById(@PathVariable Long payeeId);
}
