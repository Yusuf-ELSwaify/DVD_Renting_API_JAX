package org.example.services.dtos.staff;

import lombok.Value;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Staff}
 */
@Value
public class StaffSummaryDto {
	Short id;
	String firstName;
	String lastName;
	String email;
	String username;
	Instant lastUpdate;
}