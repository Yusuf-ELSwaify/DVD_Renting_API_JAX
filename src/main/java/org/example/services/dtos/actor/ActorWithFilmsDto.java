package org.example.services.dtos.actor;

import lombok.Value;
import org.example.services.dtos.film.FilmDto;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Value
public class ActorWithFilmsDto implements Serializable {
	Integer id;
	String firstName;
	String lastName;
	Set<FilmDto> actorFilms;
}