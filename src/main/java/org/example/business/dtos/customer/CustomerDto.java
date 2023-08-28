package org.example.business.dtos.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Customer;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.store.StoreDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Customer}
 */
@Data
@NoArgsConstructor
public class CustomerDto implements ReaderDto<Customer> {
	Integer id;
	StoreDto store;
	String firstName;
	String lastName;
	String email;
	AddressDto address;
	Boolean active;
	Date createDate;
	Date lastUpdate;
}