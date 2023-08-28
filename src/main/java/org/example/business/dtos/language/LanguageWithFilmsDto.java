package org.example.business.dtos.language;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.business.dtos.film.FilmDto;

import java.util.Date;
import java.util.Set;

/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Data
@NoArgsConstructor
public class LanguageWithFilmsDto {
	Short id;
	String name;
	Date lastUpdate;
	Set<FilmDto> madeByFilms;
}