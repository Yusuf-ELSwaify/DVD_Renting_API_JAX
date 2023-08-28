package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.country.CountryAddDto;
import org.example.business.dtos.country.CountryDto;
import org.example.business.dtos.country.CountryUpdateDto;
import org.example.business.dtos.messages.Message;
import org.example.business.services.CountryService;

import java.util.List;

@WebService
public class CountryController {
	private static final CountryService service = CountryService.INSTANCE;
	
	public List<CountryDto> getCountryList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public CountryDto getCountry(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public CountryDto insertCountry(CountryAddDto countryDto) {
		return service.insert(countryDto);
	}
	public CountryDto updateCountry(CountryUpdateDto countryDto) {
		return service.update(countryDto);
	}
	public Message deleteCountry(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}
}
