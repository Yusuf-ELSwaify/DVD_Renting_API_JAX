package org.example.services.dtos.city;

import lombok.Value;
import org.example.persistence.models.City;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.country.CountryDto;


/**
 * DTO for {@link org.example.persistence.models.City}
 */
@Value
public class CityAddDto implements AdderDto<City> {
	String city;
	CountryDto country;
}