package org.example.services.dtos.language;

import lombok.Value;
import org.example.persistence.models.Language;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Value
public class LanguageUpdateDeleteDto implements UpdaterDto<Language>, DeleterDto<Language> {
	Short id;
	String name;
}