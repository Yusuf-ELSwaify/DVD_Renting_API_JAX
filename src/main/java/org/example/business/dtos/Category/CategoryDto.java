package org.example.business.dtos.Category;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Category;
import org.example.business.dtos.ReaderDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Category}
 */
@Data
@NoArgsConstructor
public class CategoryDto implements ReaderDto<Category> {
	@NotNull
	Short id;
	String name;
	Date lastUpdate;
}