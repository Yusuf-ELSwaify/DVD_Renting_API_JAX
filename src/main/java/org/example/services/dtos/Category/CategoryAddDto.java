package org.example.services.dtos.Category;

import lombok.Value;
import org.example.persistence.models.Category;
import org.example.services.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Category}
 */
@Value
public class CategoryAddDto implements AdderDto<Category> {
	String name;
}