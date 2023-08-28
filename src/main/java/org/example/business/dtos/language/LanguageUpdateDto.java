package org.example.business.dtos.language;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Language;
import org.example.business.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Data
@NoArgsConstructor
public class LanguageUpdateDto implements UpdaterDto<Language>, java.io.Serializable {
	@NotNull
	Short id;
	String name;
}