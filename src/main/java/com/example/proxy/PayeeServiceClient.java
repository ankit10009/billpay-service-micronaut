package com.example.proxy;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("/payees")
public interface PayeeServiceClient {

    @Get("/{payeeId}")
    Payee getPayeeById(Long payeeId);
}
