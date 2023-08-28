package org.example.business.services;

import org.example.business.dtos.payment.PaymentUpdateDto;
import org.example.persistence.models.Payment;
import org.example.persistence.repositories.PaymentRepository;
import org.example.business.dtos.payment.PaymentAddDto;
import org.example.business.dtos.payment.PaymentDto;
import org.example.business.mappers.PaymentMapper;

public class PaymentService extends DefaultService<Payment, Integer, PaymentDto, PaymentAddDto, PaymentUpdateDto> {
	public static final PaymentService INSTANCE = new PaymentService();
	private PaymentService() {
		super(PaymentRepository.INSTANCE, PaymentMapper.INSTANCE);
	}
}
