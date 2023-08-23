package org.example.services.dtos.actor;

import lombok.Value;
import org.example.persistence.models.Actor;
import org.example.services.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Value
public class ActorAddDto implements AdderDto<Actor> {
	String firstName;
	String lastName;
}