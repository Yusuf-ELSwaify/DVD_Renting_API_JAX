package org.example.services;

import org.example.persistence.models.Payment;
import org.example.persistence.repositories.CRUDRepository;
import org.example.persistence.repositories.PaymentRepository;
import org.example.services.dtos.payment.PaymentAddDto;
import org.example.services.dtos.payment.PaymentDto;
import org.example.services.dtos.payment.PaymentUpdateDeleteDto;
import org.example.services.mappers.GenericMapper;
import org.example.services.mappers.PaymentMapper;

public class PaymentService extends DefaultService<Payment, Integer, PaymentDto, PaymentAddDto, PaymentUpdateDeleteDto, PaymentUpdateDeleteDto> {
	public static final PaymentService INSTANCE = new PaymentService();
	private PaymentService() {
		super(PaymentRepository.INSTANCE, PaymentMapper.INSTANCE);
	}
}
