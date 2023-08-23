package org.example.services;

import org.example.persistence.models.Country;
import org.example.persistence.repositories.CountryRepository;
import org.example.services.dtos.country.CountryAddDto;
import org.example.services.dtos.country.CountryDto;
import org.example.services.dtos.country.CountryUpdateDeleteDto;
import org.example.services.mappers.CountryMapper;

public class CountryService extends DefaultService<Country, Integer, CountryDto, CountryAddDto, CountryUpdateDeleteDto, CountryUpdateDeleteDto> {
	public static final CountryService INSTANCE = new CountryService();
	private CountryService() {
		super(CountryRepository.INSTANCE, CountryMapper.INSTANCE);
	}
}
