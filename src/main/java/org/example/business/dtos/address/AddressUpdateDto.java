package org.example.business.dtos.address;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Address;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.city.CityDto;


/**
 * DTO for {@link org.example.persistence.models.Address}
 */
@Data
@NoArgsConstructor
public class AddressUpdateDto implements UpdaterDto<Address>, java.io.Serializable {
	@NotNull
	Integer id;
	String address;
	String address2;
	String district;
	CityDto city;
	String postalCode;
	String phone;
}