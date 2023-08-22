package org.example.persistence.repositories;

import org.example.persistence.models.Payment;

public class PaymentRepository extends CRUDRepository<Payment, Integer> {
	public PaymentRepository() {
		super(Payment.class);
	}
}
