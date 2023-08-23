package org.example.services.dtos.film;

import lombok.Value;
import org.example.persistence.models.Film;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;

import java.math.BigDecimal;

/**
 * DTO for {@link org.example.persistence.models.Film}
 */
@Value
public class FilmUpdateDeleteDto implements UpdaterDto<Film>, DeleterDto<Film> {
	Integer id;
	String title;
	String description;
	Integer releaseYear;
	Short rentalDuration;
	BigDecimal rentalRate;
	Integer length;
	BigDecimal replacementCost;
	String rating;
	String specialFeatures;
}