package org.example.business.mappers;

import org.example.business.dtos.address.AddressUpdateDto;
import org.example.persistence.models.Address;
import org.example.business.dtos.address.AddressAddDto;
import org.example.business.dtos.address.AddressDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {CityMapper.class})
public interface AddressMapper extends GenericMapper<Address, AddressDto, AddressAddDto, AddressUpdateDto> {
	AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
}