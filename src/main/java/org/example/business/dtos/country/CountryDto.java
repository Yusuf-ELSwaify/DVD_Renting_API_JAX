package org.example.business.dtos.country;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Country;
import org.example.business.dtos.ReaderDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Country}
 */
@Data
@NoArgsConstructor
public class CountryDto implements ReaderDto<Country> {
	Integer id;
	String country;
	Date lastUpdate;
}