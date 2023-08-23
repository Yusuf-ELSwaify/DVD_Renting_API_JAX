package org.example.services.dtos.staff;

import lombok.ToString;
import lombok.Value;
import org.example.persistence.models.Staff;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.store.StoreDto;

import java.time.Instant;

/**
 * DTO for {@link Staff}
 */
@Value
public class StaffDto implements ReaderDto<Staff> {
	Short id;
	String firstName;
	String lastName;
	AddressDto address;
	StoreDto store;
	@ToString.Exclude
	byte[] picture;
	String email;
	Boolean active;
	String username;
	Instant lastUpdate;
}