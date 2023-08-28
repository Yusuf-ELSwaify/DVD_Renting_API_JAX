package org.example.business.dtos.city;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.City;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.country.CountryDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.City}
 */
@Data
@NoArgsConstructor
public class CityDto implements ReaderDto<City> {
	@NotNull
	Integer id;
	String city;
	CountryDto country;
	Date lastUpdate;
}