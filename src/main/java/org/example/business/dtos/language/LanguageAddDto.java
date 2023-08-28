package org.example.business.dtos.language;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Language;
import org.example.business.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Data
@NoArgsConstructor
public class LanguageAddDto implements AdderDto<Language> {
	String name;
}