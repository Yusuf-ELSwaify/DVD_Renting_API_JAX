package org.example.services.dtos.payment;

import lombok.Value;
import org.example.persistence.models.Payment;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.customer.CustomerDto;
import org.example.services.dtos.rental.RentalSummaryDto;
import org.example.services.dtos.staff.StaffSummaryDto;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Payment}
 */
@Value
public class PaymentAddDto implements AdderDto<Payment> {
	CustomerDto customer;
	StaffSummaryDto staff;
	RentalSummaryDto rental;
	BigDecimal amount;
	Instant paymentDate;
}