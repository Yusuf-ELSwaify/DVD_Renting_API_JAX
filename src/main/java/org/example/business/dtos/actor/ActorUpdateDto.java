package org.example.business.dtos.actor;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Actor;
import org.example.business.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Data
@NoArgsConstructor
public class ActorUpdateDto implements UpdaterDto<Actor>, java.io.Serializable {
	@NotNull
	Integer id;
	String firstName;
	String lastName;
}