package org.example.business.services;

import org.example.persistence.models.Staff;
import org.example.persistence.repositories.StaffRepository;
import org.example.business.dtos.staff.StaffAddDto;
import org.example.business.dtos.staff.StaffDto;
import org.example.business.dtos.staff.StaffUpdateDto;
import org.example.business.mappers.StaffMapper;

public class StaffService extends DefaultService<Staff, Short, StaffDto, StaffAddDto, StaffUpdateDto> {
	public static final StaffService INSTANCE = new StaffService();

	private StaffService() {
		super(StaffRepository.INSTANCE, StaffMapper.INSTANCE);
	}
}
