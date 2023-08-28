package org.example.business.dtos.actor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.business.dtos.film.FilmDto;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Data
@NoArgsConstructor
public class ActorWithFilmsDto {
	Integer id;
	String firstName;
	String lastName;
	Set<FilmDto> actorFilms;
}