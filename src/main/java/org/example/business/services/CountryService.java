package org.example.business.services;

import org.example.business.dtos.country.CountryUpdateDto;
import org.example.persistence.models.Country;
import org.example.persistence.repositories.CountryRepository;
import org.example.business.dtos.country.CountryAddDto;
import org.example.business.dtos.country.CountryDto;
import org.example.business.mappers.CountryMapper;

public class CountryService extends DefaultService<Country, Integer, CountryDto, CountryAddDto, CountryUpdateDto> {
	public static final CountryService INSTANCE = new CountryService();
	private CountryService() {
		super(CountryRepository.INSTANCE, CountryMapper.INSTANCE);
	}
}
