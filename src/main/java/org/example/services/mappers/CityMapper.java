package org.example.services.mappers;

import org.example.persistence.models.City;
import org.example.services.dtos.city.CityAddDto;
import org.example.services.dtos.city.CityDto;
import org.example.services.dtos.city.CityUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {CountryMapper.class})
public interface CityMapper extends GenericMapper<City, CityDto, CityAddDto, CityUpdateDeleteDto, CityUpdateDeleteDto> {
	CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);
}