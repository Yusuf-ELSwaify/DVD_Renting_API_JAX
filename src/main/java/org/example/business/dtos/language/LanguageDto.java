package org.example.business.dtos.language;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Language;
import org.example.business.dtos.ReaderDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Language}
 */
@Data
@NoArgsConstructor
public class LanguageDto implements ReaderDto<Language> {
	Short id;
	String name;
	Date lastUpdate;
}