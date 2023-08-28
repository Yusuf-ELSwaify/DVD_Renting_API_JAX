package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.messages.Message;
import org.example.business.dtos.payment.PaymentAddDto;
import org.example.business.dtos.payment.PaymentDto;
import org.example.business.dtos.payment.PaymentUpdateDto;
import org.example.business.services.PaymentService;

import java.util.List;

@WebService
public class PaymentController {
	private static final PaymentService service = PaymentService.INSTANCE;
	
	public List<PaymentDto> getPaymentList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public PaymentDto getPayment(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public PaymentDto insertPayment(PaymentAddDto paymentDto) {
		return service.insert(paymentDto);
	}
	public PaymentDto updatePayment(PaymentUpdateDto paymentDto) {
		return service.update(paymentDto);
	}
	public Message deletePayment(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}
}
