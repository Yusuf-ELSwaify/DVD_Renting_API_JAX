package org.example.services.dtos.country;

import lombok.Value;
import org.example.persistence.models.Country;
import org.example.services.dtos.ReaderDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Country}
 */
@Value
public class CountryDto implements ReaderDto<Country> {
	Integer id;
	String country;
	Instant lastUpdate;
}