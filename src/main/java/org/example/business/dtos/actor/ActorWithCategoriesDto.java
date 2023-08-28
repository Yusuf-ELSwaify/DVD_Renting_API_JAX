package org.example.business.dtos.actor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.business.dtos.Category.CategoryDto;

import java.util.Date;
import java.util.Set;
/**
 * DTO for {@link org.example.persistence.models.Actor}
 */
@Data
@NoArgsConstructor
public class ActorWithCategoriesDto {
	Integer id;
	String firstName;
	String lastName;
	Date lastUpdate;
	Set<CategoryDto> actorFilmsCategories;
}
