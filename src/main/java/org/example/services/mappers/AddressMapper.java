package org.example.services.mappers;

import org.example.persistence.models.Address;
import org.example.services.dtos.address.AddressAddDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.address.AddressUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {CityMapper.class})
public interface AddressMapper extends GenericMapper<Address, AddressDto, AddressAddDto, AddressUpdateDeleteDto, AddressUpdateDeleteDto> {
	AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
}