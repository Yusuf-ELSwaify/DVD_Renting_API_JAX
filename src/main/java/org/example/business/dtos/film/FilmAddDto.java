package org.example.business.dtos.film;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Film;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.language.LanguageDto;

import java.math.BigDecimal;

/**
 * DTO for {@link org.example.persistence.models.Film}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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