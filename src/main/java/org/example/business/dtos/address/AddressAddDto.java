package org.example.business.dtos.address;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Address;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.city.CityDto;


/**
 * DTO for {@link org.example.persistence.models.Address}
 */
@Data
@NoArgsConstructor
public class AddressAddDto implements AdderDto<Address> {
	String address;
	String address2;
	String district;
	CityDto city;
	String postalCode;
	String phone;
}