package org.example.services.dtos.rental;

import lombok.Value;
import org.example.persistence.models.Rental;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.customer.CustomerDto;
import org.example.services.dtos.inventory.InventoryDto;
import org.example.services.dtos.staff.StaffSummaryDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Rental}
 */
@Value
public class RentalAddDto implements AdderDto<Rental> {
	Instant rentalDate;
	InventoryDto inventory;
	CustomerDto customer;
	Instant returnDate;
	StaffSummaryDto staff;
}