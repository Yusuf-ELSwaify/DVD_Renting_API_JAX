package org.example.services.mappers;

import org.example.persistence.models.Rental;
import org.example.services.dtos.rental.RentalAddDto;
import org.example.services.dtos.rental.RentalDto;
import org.example.services.dtos.rental.RentalSummaryDto;
import org.example.services.dtos.rental.RentalUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {InventoryMapper.class, CustomerMapper.class, StaffMapper.class})
public interface RentalMapper extends GenericMapper<Rental, RentalDto, RentalAddDto, RentalUpdateDeleteDto, RentalUpdateDeleteDto> {
	RentalMapper INSTANCE = Mappers.getMapper(RentalMapper.class);

	RentalSummaryDto getRentalSummaryDto(Rental rental);
}