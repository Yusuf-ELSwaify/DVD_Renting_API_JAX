package org.example.services.dtos.city;

import lombok.Value;
import org.example.persistence.models.City;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.country.CountryDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.City}
 */
@Value
public class CityDto implements ReaderDto<City> {
	Integer id;
	String city;
	CountryDto country;
	Instant lastUpdate;
}