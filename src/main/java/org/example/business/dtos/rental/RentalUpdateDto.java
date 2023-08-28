package org.example.business.dtos.rental;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Rental;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.inventory.InventoryDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Rental}
 */
@Data
@NoArgsConstructor
public class RentalUpdateDto implements UpdaterDto<Rental>, java.io.Serializable {
	@NotNull
	Integer id;
	Date rentalDate;
	InventoryDto inventory;
	CustomerDto customer;
	Date returnDate;
	StaffSummaryDto staff;
}