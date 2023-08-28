package org.example.business.dtos.staff;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Value;
import org.example.persistence.models.Staff;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.store.StoreDto;

import java.util.Date;

/**
 * DTO for {@link Staff}
 */
@Data
@NoArgsConstructor
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
	Date lastUpdate;
}