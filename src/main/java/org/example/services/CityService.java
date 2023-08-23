package org.example.services;

import org.example.persistence.models.Category;
import org.example.persistence.models.City;
import org.example.persistence.repositories.CRUDRepository;
import org.example.persistence.repositories.CityRepository;
import org.example.services.dtos.Category.CategoryAddDto;
import org.example.services.dtos.Category.CategoryDto;
import org.example.services.dtos.Category.CategoryUpdateDeleteDto;
import org.example.services.dtos.city.CityAddDto;
import org.example.services.dtos.city.CityDto;
import org.example.services.dtos.city.CityUpdateDeleteDto;
import org.example.services.mappers.CityMapper;
import org.example.services.mappers.GenericMapper;

public class CityService extends DefaultService<City, Integer, CityDto, CityAddDto, CityUpdateDeleteDto, CityUpdateDeleteDto> {
	public static final CityService INSTANCE = new CityService();
	private CityService() {
		super(CityRepository.INSTANCE, CityMapper.INSTANCE);
	}
}
