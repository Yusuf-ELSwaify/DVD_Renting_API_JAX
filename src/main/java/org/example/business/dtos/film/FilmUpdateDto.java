package org.example.business.dtos.film;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Film;
import org.example.business.dtos.UpdaterDto;

import java.math.BigDecimal;

/**
 * DTO for {@link org.example.persistence.models.Film}
 */
@Data
@NoArgsConstructor
public class FilmUpdateDto implements UpdaterDto<Film>, java.io.Serializable {
	@NotNull
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