package com.example.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.model.naming.NamingStrategies;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@MappedEntity(value = "payments", namingStrategy = NamingStrategies.UnderScoreSeparatedLowerCase.class)
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    private Long payeeId;
    private Long accountId;
    private BigDecimal amount;
    private LocalDateTime paymentDate;

    // Constructors, Getters, and Setters
}
