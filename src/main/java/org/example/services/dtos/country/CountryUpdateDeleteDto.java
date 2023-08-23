package org.example.services.dtos.country;

import lombok.Value;
import org.example.persistence.models.Country;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Country}
 */
@Value
public class CountryUpdateDeleteDto implements UpdaterDto<Country>, DeleterDto<Country> {
	Integer id;
	String country;
}