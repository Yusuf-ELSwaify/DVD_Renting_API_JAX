package org.example.services.dtos.language;

import lombok.Value;
import org.example.services.dtos.film.FilmDto;

import java.time.Instant;
import java.util.Set;

/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Value
public class LanguageWithFilmsDto {
	Short id;
	String name;
	Instant lastUpdate;
	Set<FilmDto> madeByFilms;
}