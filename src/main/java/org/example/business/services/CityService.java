package org.example.business.services;

import org.example.business.dtos.city.CityUpdateDto;
import org.example.persistence.models.City;
import org.example.persistence.repositories.CityRepository;
import org.example.business.dtos.city.CityAddDto;
import org.example.business.dtos.city.CityDto;
import org.example.business.mappers.CityMapper;

public class CityService extends DefaultService<City, Integer, CityDto, CityAddDto, CityUpdateDto> {
	public static final CityService INSTANCE = new CityService();
	private CityService() {
		super(CityRepository.INSTANCE, CityMapper.INSTANCE);
	}
}
