package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.language.LanguageAddDto;
import org.example.business.dtos.language.LanguageDto;
import org.example.business.dtos.language.LanguageUpdateDto;
import org.example.business.dtos.language.LanguageWithFilmsDto;
import org.example.business.dtos.messages.Message;
import org.example.business.mappers.LanguageMapper;
import org.example.business.services.LanguageService;

import java.util.List;

@WebService
public class LanguageController {
	private static final LanguageService service = LanguageService.INSTANCE;
	
	public List<LanguageDto> getLanguageList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public LanguageDto getLanguage(@WebParam(name = "id") Short id) {
		return service.get(id);
	}
	public LanguageDto insertLanguage(LanguageAddDto languageDto) {
		return service.insert(languageDto);
	}
	public LanguageDto updateLanguage(LanguageUpdateDto languageDto) {
		return service.update(languageDto);
	}
	public Message deleteLanguage(@WebParam(name = "id") Short id) {
		return service.delete(id);
	}

	public LanguageWithFilmsDto getLanguageWithFilms(@WebParam(name = "id") Short id) {
		return service.getLanguageWithFilms(id);
	}
}
