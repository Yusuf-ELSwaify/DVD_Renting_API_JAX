package org.example.business.dtos.payment;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.business.dtos.rental.RentalUpdateDto;
import org.example.persistence.models.Payment;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Payment}
 */
@Data
@NoArgsConstructor
public class PaymentUpdateDto implements UpdaterDto<Payment>, java.io.Serializable {
	@NotNull
	Integer id;
	CustomerDto customer;
	StaffSummaryDto staff;
	RentalUpdateDto rental;
	BigDecimal amount;
	Date paymentDate;
}