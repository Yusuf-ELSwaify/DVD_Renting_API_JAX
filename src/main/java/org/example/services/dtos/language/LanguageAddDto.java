package org.example.services.dtos.language;

import lombok.Value;
import org.example.persistence.models.Language;
import org.example.services.dtos.AdderDto;


/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Value
public class LanguageAddDto implements AdderDto<Language> {
	String name;
}