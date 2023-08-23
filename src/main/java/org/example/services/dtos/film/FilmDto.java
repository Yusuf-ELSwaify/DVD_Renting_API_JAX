package org.example.services.dtos.film;

import lombok.Value;
import org.example.persistence.models.Film;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.language.LanguageDto;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Film}
 */
@Value
public class FilmDto implements ReaderDto<Film> {
	Integer id;
	String title;
	String description;
	Integer releaseYear;
	LanguageDto language;
	LanguageDto originalLanguage;
	Short rentalDuration;
	BigDecimal rentalRate;
	Integer length;
	BigDecimal replacementCost;
	String rating;
	String specialFeatures;
	Instant lastUpdate;
}