package org.example.business.dtos.payment;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Payment;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.rental.RentalSummaryDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Payment}
 */
@Data
@NoArgsConstructor
public class PaymentAddDto implements AdderDto<Payment> {
	CustomerDto customer;
	StaffSummaryDto staff;
	RentalSummaryDto rental;
	BigDecimal amount;
	Date paymentDate;
}