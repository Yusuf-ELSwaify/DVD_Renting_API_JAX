package org.example.business.dtos.city;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.City;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.country.CountryDto;


/**
 * DTO for {@link org.example.persistence.models.City}
 */
@Data
@NoArgsConstructor
public class CityAddDto implements AdderDto<City> {
	String city;
	CountryDto country;
}