package org.example.persistence.repositories;

import org.example.persistence.models.Payment;

public class PaymentRepository extends CRUDRepository<Payment, Integer> {
	public static final PaymentRepository INSTANCE = new PaymentRepository();
	private PaymentRepository() {
		super(Payment.class);
	}
}
