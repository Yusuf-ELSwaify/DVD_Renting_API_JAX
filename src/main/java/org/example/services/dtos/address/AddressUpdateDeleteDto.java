package org.example.services.dtos.address;

import lombok.Value;
import org.example.persistence.models.Address;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.dtos.city.CityDto;


/**
 * DTO for {@link org.example.persistence.models.Address}
 */
@Value
public class AddressUpdateDeleteDto implements UpdaterDto<Address>, DeleterDto<Address> {
	Integer id;
	String address;
	String address2;
	String district;
	CityDto city;
	String postalCode;
	String phone;
}