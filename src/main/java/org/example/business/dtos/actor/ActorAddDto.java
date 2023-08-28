package org.example.business.dtos.actor;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Actor;
import org.example.business.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Data
@NoArgsConstructor
public class ActorAddDto implements AdderDto<Actor> {
	@NotNull
	String firstName;
	String lastName;
}