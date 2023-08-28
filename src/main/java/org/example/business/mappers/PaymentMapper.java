package org.example.business.mappers;

import org.example.persistence.models.Payment;
import org.example.business.dtos.payment.PaymentAddDto;
import org.example.business.dtos.payment.PaymentDto;
import org.example.business.dtos.payment.PaymentUpdateDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {CustomerMapper.class, StaffMapper.class})
public interface PaymentMapper extends GenericMapper<Payment, PaymentDto, PaymentAddDto, PaymentUpdateDto> {
	PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);
}