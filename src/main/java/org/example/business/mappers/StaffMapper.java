package org.example.business.mappers;

import org.example.business.dtos.staff.StaffUpdateDto;
import org.example.persistence.models.Staff;
import org.example.business.dtos.staff.StaffAddDto;
import org.example.business.dtos.staff.StaffDto;
import org.example.business.dtos.staff.StaffSummaryDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {AddressMapper.class})
public interface StaffMapper extends GenericMapper<Staff, StaffDto, StaffAddDto, StaffUpdateDto> {
	StaffMapper INSTANCE = Mappers.getMapper(StaffMapper.class);
	Staff fromStaffSummaryDtotoEntity(StaffSummaryDto summaryDto);
	StaffSummaryDto toStaffSummaryDto(Staff staff);
}