package org.example.business.mappers;

import org.example.business.dtos.rental.RentalUpdateDto;
import org.example.persistence.models.Rental;
import org.example.business.dtos.rental.RentalAddDto;
import org.example.business.dtos.rental.RentalDto;
import org.example.business.dtos.rental.RentalSummaryDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {InventoryMapper.class, CustomerMapper.class, StaffMapper.class})
public interface RentalMapper extends GenericMapper<Rental, RentalDto, RentalAddDto, RentalUpdateDto> {
	RentalMapper INSTANCE = Mappers.getMapper(RentalMapper.class);

	RentalSummaryDto getRentalSummaryDto(Rental rental);
}