package org.example.business.dtos.rental;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Rental;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.inventory.InventoryDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.util.Date;

/**
 * DTO for {@link Rental}
 */
@Data
@NoArgsConstructor
public class RentalDto implements ReaderDto<Rental> {
	Integer id;
	Date rentalDate;
	InventoryDto inventory;
	CustomerDto customer;
	Date returnDate;
	StaffSummaryDto staff;
	Date lastUpdate;
}