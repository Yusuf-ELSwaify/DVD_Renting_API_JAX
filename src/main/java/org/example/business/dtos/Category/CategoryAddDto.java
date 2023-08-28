package org.example.business.dtos.Category;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Category;
import org.example.business.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Category}
 */
@Data
@NoArgsConstructor
public class CategoryAddDto implements AdderDto<Category> {
	String name;
}