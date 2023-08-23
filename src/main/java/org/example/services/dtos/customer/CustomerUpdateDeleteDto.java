package org.example.services.dtos.customer;

import lombok.Value;
import org.example.persistence.models.Customer;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.store.StoreDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Customer}
 */
@Value
public class CustomerUpdateDeleteDto implements UpdaterDto<Customer>, DeleterDto<Customer> {
	Integer id;
	StoreDto store;
	String firstName;
	String lastName;
	String email;
	AddressDto address;
	Boolean active;
	Instant createDate;
}