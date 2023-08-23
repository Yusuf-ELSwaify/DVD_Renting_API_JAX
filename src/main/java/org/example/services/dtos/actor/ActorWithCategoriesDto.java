package org.example.services.dtos.actor;

import lombok.Value;
import org.example.services.dtos.Category.CategoryDto;

import java.time.Instant;
import java.util.Set;
/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Value
public class ActorWithCategoriesDto {
	Integer id;
	String firstName;
	String lastName;
	Instant lastUpdate;
	Set<CategoryDto> actorFilmsCategories;
}
