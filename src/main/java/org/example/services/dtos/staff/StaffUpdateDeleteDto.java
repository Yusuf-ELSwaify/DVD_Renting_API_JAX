package org.example.services.dtos.staff;

import lombok.ToString;
import lombok.Value;
import org.example.persistence.models.Staff;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Staff}
 */
@Value
public class StaffUpdateDeleteDto implements UpdaterDto<Staff>, DeleterDto<Staff> {
	Short id;
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