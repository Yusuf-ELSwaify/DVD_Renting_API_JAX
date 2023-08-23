package org.example.services.dtos.customer;

import lombok.Value;
import org.example.persistence.models.Customer;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Customer}
 */
@Value
public class CustomerAddDto implements AdderDto<Customer> {
	StoreDto store;
	String firstName;
	String lastName;
	String email;
	AddressDto address;
	Boolean active;
}