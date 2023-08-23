package org.example.services;

import org.example.persistence.models.Staff;
import org.example.persistence.repositories.StaffRepository;
import org.example.services.dtos.staff.StaffAddDto;
import org.example.services.dtos.staff.StaffDto;
import org.example.services.dtos.staff.StaffUpdateDeleteDto;
import org.example.services.mappers.StaffMapper;

public class StaffService extends DefaultService<Staff, Short, StaffDto, StaffAddDto, StaffUpdateDeleteDto, StaffUpdateDeleteDto> {
	public static final StaffService INSTANCE = new StaffService();

	private StaffService() {
		super(StaffRepository.INSTANCE, StaffMapper.INSTANCE);
	}
}
