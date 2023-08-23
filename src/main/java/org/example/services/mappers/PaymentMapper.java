package org.example.services.mappers;

import org.example.persistence.models.Payment;
import org.example.services.dtos.payment.PaymentAddDto;
import org.example.services.dtos.payment.PaymentDto;
import org.example.services.dtos.payment.PaymentUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {CustomerMapper.class, StaffMapper.class})
public interface PaymentMapper extends GenericMapper<Payment, PaymentDto, PaymentAddDto, PaymentUpdateDeleteDto, PaymentUpdateDeleteDto> {
	PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);
}