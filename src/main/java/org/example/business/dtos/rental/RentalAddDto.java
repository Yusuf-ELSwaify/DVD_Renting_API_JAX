package org.example.business.dtos.rental;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Rental;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.inventory.InventoryDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Rental}
 */
@Data
@NoArgsConstructor
public class RentalAddDto implements AdderDto<Rental> {
	Date rentalDate;
	InventoryDto inventory;
	CustomerDto customer;
	Date returnDate;
	StaffSummaryDto staff;
}