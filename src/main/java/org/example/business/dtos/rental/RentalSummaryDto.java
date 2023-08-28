package org.example.business.dtos.rental;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Rental}
 */
@Data
@NoArgsConstructor
public class RentalSummaryDto {
	Integer id;
	Date rentalDate;
	Date returnDate;
}