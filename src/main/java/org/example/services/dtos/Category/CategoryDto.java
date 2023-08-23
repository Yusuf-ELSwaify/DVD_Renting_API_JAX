package org.example.services.dtos.Category;

import lombok.Value;
import org.example.persistence.models.Category;
import org.example.services.dtos.ReaderDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Category}
 */
@Value
public class CategoryDto implements ReaderDto<Category> {
	Short id;
	String name;
	Instant lastUpdate;
}