package org.example.services;

import org.example.persistence.models.Language;
import org.example.persistence.repositories.LanguageRepository;
import org.example.services.dtos.language.LanguageAddDto;
import org.example.services.dtos.language.LanguageDto;
import org.example.services.dtos.language.LanguageUpdateDeleteDto;
import org.example.services.dtos.language.LanguageWithFilmsDto;
import org.example.services.mappers.LanguageMapper;

public class LanguageService extends DefaultService<Language, Short, LanguageDto, LanguageAddDto, LanguageUpdateDeleteDto, LanguageUpdateDeleteDto> {
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
