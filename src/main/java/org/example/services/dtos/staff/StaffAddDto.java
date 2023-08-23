package org.example.services.dtos.staff;

import lombok.ToString;
import lombok.Value;
import org.example.persistence.models.Staff;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Staff}
 */
@Value
public class StaffAddDto implements AdderDto<Staff> {
	String firstName;
	String lastName;
	AddressDto address;
	@ToString.Exclude
	byte[] picture;
	String email;
	StoreDto store;
	Boolean active;
	String username;
}