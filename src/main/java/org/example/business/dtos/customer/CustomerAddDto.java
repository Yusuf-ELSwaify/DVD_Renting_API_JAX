package org.example.business.dtos.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Customer;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Customer}
 */
@Data
@NoArgsConstructor
public class CustomerAddDto implements AdderDto<Customer> {
	StoreDto store;
	String firstName;
	String lastName;
	String email;
	AddressDto address;
	Boolean active;
}