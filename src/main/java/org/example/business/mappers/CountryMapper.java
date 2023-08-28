package org.example.business.mappers;

import org.example.persistence.models.Country;
import org.example.business.dtos.country.CountryAddDto;
import org.example.business.dtos.country.CountryDto;
import org.example.business.dtos.country.CountryUpdateDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapper extends GenericMapper<Country, CountryDto, CountryAddDto, CountryUpdateDto> {
	CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
}