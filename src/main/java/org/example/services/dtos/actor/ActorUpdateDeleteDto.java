package org.example.services.dtos.actor;

import lombok.Value;
import org.example.persistence.models.Actor;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Value
public class ActorUpdateDeleteDto implements UpdaterDto<Actor>, DeleterDto<Actor> {
	Integer id;
	String firstName;
	String lastName;
}