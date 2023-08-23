package org.example.services.dtos.Category;

import lombok.Value;
import org.example.persistence.models.Category;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Category}
 */
@Value
public class CategoryUpdateDeleteDto implements UpdaterDto<Category>, DeleterDto<Category> {
	Short id;
	String name;
}