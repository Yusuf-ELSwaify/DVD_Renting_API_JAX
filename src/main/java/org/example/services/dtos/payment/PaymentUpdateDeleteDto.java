package org.example.services.dtos.payment;

import lombok.Value;
import org.example.persistence.models.Payment;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.dtos.customer.CustomerDto;
import org.example.services.dtos.rental.RentalUpdateDeleteDto;
import org.example.services.dtos.staff.StaffSummaryDto;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Payment}
 */
@Value
public class PaymentUpdateDeleteDto implements UpdaterDto<Payment>, DeleterDto<Payment> {
	Integer id;
	CustomerDto customer;
	StaffSummaryDto staff;
	RentalUpdateDeleteDto rental;
	BigDecimal amount;
	Instant paymentDate;
}