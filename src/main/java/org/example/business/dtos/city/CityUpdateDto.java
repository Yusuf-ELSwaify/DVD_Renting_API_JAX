package org.example.business.dtos.city;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.City;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.country.CountryDto;


/**
 * DTO for {@link org.example.persistence.models.City}
 */
@Data
@NoArgsConstructor
public class CityUpdateDto implements UpdaterDto<City>, java.io.Serializable {
	@NotNull
	Integer id;
	String city;
	CountryDto country;
}