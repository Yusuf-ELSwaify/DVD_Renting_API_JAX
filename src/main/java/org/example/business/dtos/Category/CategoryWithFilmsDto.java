package org.example.business.dtos.Category;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Category;
import org.example.business.dtos.film.FilmDto;

import java.util.Date;
import java.util.Set;

/**
 * DTO for {@link Category}
 */
@Data
@NoArgsConstructor
public class CategoryWithFilmsDto {
	Short id;
	String name;
	Date lastUpdate;
	Set<FilmDto> films;
}