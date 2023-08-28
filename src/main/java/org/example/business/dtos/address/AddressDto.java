package org.example.business.dtos.address;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Address;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.city.CityDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Address}
 */
@Data
@NoArgsConstructor
public class AddressDto implements ReaderDto<Address> {
	Integer id;
	String address;
	String address2;
	String district;
	CityDto city;
	String postalCode;
	String phone;
	Date lastUpdate;
	byte[] location;
}