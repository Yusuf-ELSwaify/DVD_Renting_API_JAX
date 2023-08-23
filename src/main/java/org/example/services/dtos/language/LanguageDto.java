package org.example.services.dtos.language;

import lombok.Value;
import org.example.persistence.models.Language;
import org.example.services.dtos.ReaderDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Value
public class LanguageDto implements ReaderDto<Language> {
	Short id;
	String name;
	Instant lastUpdate;
}