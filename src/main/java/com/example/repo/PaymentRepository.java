package com.example.repo;

import com.example.model.Payment;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
}

