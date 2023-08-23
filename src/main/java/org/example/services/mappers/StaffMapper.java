package org.example.services.mappers;

import org.example.persistence.models.Staff;
import org.example.services.dtos.staff.StaffAddDto;
import org.example.services.dtos.staff.StaffDto;
import org.example.services.dtos.staff.StaffSummaryDto;
import org.example.services.dtos.staff.StaffUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {AddressMapper.class})
public interface StaffMapper extends GenericMapper<Staff, StaffDto, StaffAddDto, StaffUpdateDeleteDto, StaffUpdateDeleteDto> {
	StaffMapper INSTANCE = Mappers.getMapper(StaffMapper.class);
	StaffSummaryDto toStaffSummaryDto(Staff staff);
}