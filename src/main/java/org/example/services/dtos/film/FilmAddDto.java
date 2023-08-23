package org.example.services.dtos.film;

import lombok.Value;
import org.example.persistence.models.Film;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.language.LanguageDto;

import java.math.BigDecimal;

/**
 * DTO for {@link org.example.persistence.models.Film}
 */
@Value
public class FilmAddDto implements AdderDto<Film> {
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
}