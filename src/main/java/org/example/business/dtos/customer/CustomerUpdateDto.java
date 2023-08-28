package org.example.business.dtos.customer;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Customer;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.store.StoreDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Customer}
 */
@Data
@NoArgsConstructor
public class CustomerUpdateDto implements UpdaterDto<Customer>, java.io.Serializable {
	@NotNull
	Integer id;
	StoreDto store;
	String firstName;
	String lastName;
	String email;
	AddressDto address;
	Boolean active;
}