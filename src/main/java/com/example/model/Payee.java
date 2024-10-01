package com.example.model;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Introspected
public class Payee {

    private Long id;
    private String payeeName;
    private String accountNumber;
    private String address;
   
}
