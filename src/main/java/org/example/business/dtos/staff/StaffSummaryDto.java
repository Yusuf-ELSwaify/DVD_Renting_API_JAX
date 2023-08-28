package org.example.business.dtos.staff;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Staff}
 */
@Data
@NoArgsConstructor
public class StaffSummaryDto {
	Short id;
	String firstName;
	String lastName;
	String email;
	String username;
	Date lastUpdate;
}