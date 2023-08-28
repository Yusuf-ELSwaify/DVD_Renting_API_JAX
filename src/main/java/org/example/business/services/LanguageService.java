package org.example.business.services;

import org.example.business.dtos.language.LanguageUpdateDto;
import org.example.persistence.models.Language;
import org.example.persistence.repositories.LanguageRepository;
import org.example.business.dtos.language.LanguageAddDto;
import org.example.business.dtos.language.LanguageDto;
import org.example.business.dtos.language.LanguageWithFilmsDto;
import org.example.business.mappers.LanguageMapper;

public class LanguageService extends DefaultService<Language, Short, LanguageDto, LanguageAddDto, LanguageUpdateDto> {
	public static final LanguageService INSTANCE = new LanguageService();
	private LanguageService() {
		super(LanguageRepository.INSTANCE, LanguageMapper.INSTANCE);
	}

	/**
	 * @param id id of the language.
	 * @return Language details and the films made by it.
	 */
	public LanguageWithFilmsDto getLanguageWithFilms(Short id) {
		return LanguageMapper.INSTANCE.toLanguageWithFilmsDto(getEntity(id));
	}
}
