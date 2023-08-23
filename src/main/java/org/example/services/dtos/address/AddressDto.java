package org.example.services.dtos.address;

import lombok.Value;
import org.example.persistence.models.Address;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.city.CityDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Address}
 */
@Value
public class AddressDto implements ReaderDto<Address> {
	Integer id;
	String address;
	String address2;
	String district;
	CityDto city;
	String postalCode;
	String phone;
	Instant lastUpdate;
}