package org.example.business.dtos.staff;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Value;
import org.example.persistence.models.Staff;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Staff}
 */
@Data
@NoArgsConstructor
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