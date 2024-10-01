package com.example.model;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Introspected
public class Account {

    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private String status;

    
}
