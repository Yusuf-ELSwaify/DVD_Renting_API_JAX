package org.example.business.dtos.staff;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.persistence.models.Staff;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Staff}
 */
@Data
@NoArgsConstructor
public class StaffUpdateDto implements UpdaterDto<Staff>, java.io.Serializable {
	@NotNull
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