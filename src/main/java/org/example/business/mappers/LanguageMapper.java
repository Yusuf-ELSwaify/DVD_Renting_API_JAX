package org.example.business.mappers;

import org.example.business.dtos.language.LanguageUpdateDto;
import org.example.persistence.models.Language;
import org.example.business.dtos.language.LanguageWithFilmsDto;
import org.example.business.dtos.language.LanguageAddDto;
import org.example.business.dtos.language.LanguageDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LanguageMapper extends GenericMapper<Language, LanguageDto, LanguageAddDto, LanguageUpdateDto> {
	LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

	@Mapping(source = "films", target = "madeByFilms")
	LanguageWithFilmsDto toLanguageWithFilmsDto(Language language);
}