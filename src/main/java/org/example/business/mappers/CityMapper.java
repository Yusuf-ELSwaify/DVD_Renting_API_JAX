package org.example.business.mappers;

import org.example.persistence.models.City;
import org.example.business.dtos.city.CityAddDto;
import org.example.business.dtos.city.CityDto;
import org.example.business.dtos.city.CityUpdateDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {CountryMapper.class})
public interface CityMapper extends GenericMapper<City, CityDto, CityAddDto, CityUpdateDto> {
	CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);
}