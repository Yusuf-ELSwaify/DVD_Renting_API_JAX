package org.example.business.dtos.actor;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Actor;
import org.example.business.dtos.ReaderDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Data
@NoArgsConstructor
public class ActorDto implements ReaderDto<Actor> {
	Integer id;
	String firstName;
	String lastName;
	Date lastUpdate;
}