package org.example.services.dtos.city;

import lombok.Value;
import org.example.persistence.models.City;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.dtos.country.CountryDto;


/**
 * DTO for {@link org.example.persistence.models.City}
 */
@Value
public class CityUpdateDeleteDto implements UpdaterDto<City>, DeleterDto<City> {
	Integer id;
	String city;
	CountryDto country;
}