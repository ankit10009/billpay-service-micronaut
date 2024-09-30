package com.example.repo;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
}

