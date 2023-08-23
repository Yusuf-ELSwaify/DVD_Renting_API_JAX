package org.example.services.mappers;

import org.example.persistence.models.Country;
import org.example.services.dtos.country.CountryAddDto;
import org.example.services.dtos.country.CountryDto;
import org.example.services.dtos.country.CountryUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapper extends GenericMapper<Country, CountryDto, CountryAddDto, CountryUpdateDeleteDto, CountryUpdateDeleteDto> {
	CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
}