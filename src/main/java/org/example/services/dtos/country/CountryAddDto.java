package org.example.services.dtos.country;

import lombok.Value;
import org.example.persistence.models.Country;
import org.example.services.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Country}
 */
@Value
public class CountryAddDto implements AdderDto<Country> {
	String country;
}