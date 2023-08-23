package org.example.services.mappers;

import org.example.persistence.models.Language;
import org.example.services.dtos.language.LanguageWithFilmsDto;
import org.example.services.dtos.language.LanguageAddDto;
import org.example.services.dtos.language.LanguageDto;
import org.example.services.dtos.language.LanguageUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {FilmMapper.class})
public interface LanguageMapper extends GenericMapper<Language, LanguageDto, LanguageAddDto, LanguageUpdateDeleteDto, LanguageUpdateDeleteDto> {
	LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

	LanguageWithFilmsDto toLanguageWithFilmsDto(Language language);
}