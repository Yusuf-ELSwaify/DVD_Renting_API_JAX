package org.example.services.dtos.Category;

import lombok.Value;
import org.example.persistence.models.Category;
import org.example.persistence.models.Film;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.film.FilmDto;

import java.time.Instant;
import java.util.Set;

/**
 * DTO for {@link Category}
 */
@Value
public class CategoryWithFilmsDto {
	Short id;
	String name;
	Instant lastUpdate;
	Set<FilmDto> films;
}