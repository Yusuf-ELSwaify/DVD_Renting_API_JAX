package org.example.services.dtos.actor;

import lombok.Value;
import org.example.persistence.models.Actor;
import org.example.services.dtos.ReaderDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Value
public class ActorDto implements ReaderDto<Actor> {
	Integer id;
	String firstName;
	String lastName;
	Instant lastUpdate;
}