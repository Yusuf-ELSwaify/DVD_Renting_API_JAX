package org.example.business.dtos.country;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Country;
import org.example.business.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Country}
 */
@Data
@NoArgsConstructor
public class CountryAddDto implements AdderDto<Country> {
	String country;
}