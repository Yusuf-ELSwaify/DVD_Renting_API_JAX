package org.example.business.dtos.Category;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Category;
import org.example.business.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Category}
 */
@Data
@NoArgsConstructor
public class CategoryUpdateDto implements UpdaterDto<Category>, java.io.Serializable {
	@NotNull
	Short id;
	String name;
}