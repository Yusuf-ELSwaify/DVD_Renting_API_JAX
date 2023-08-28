package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.messages.Message;
import org.example.business.dtos.staff.StaffAddDto;
import org.example.business.dtos.staff.StaffDto;
import org.example.business.dtos.staff.StaffUpdateDto;
import org.example.business.services.StaffService;

import java.util.List;

@WebService
public class StaffController {
	private static final StaffService service = StaffService.INSTANCE;
	
	public List<StaffDto> getStaffList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public StaffDto getStaff(@WebParam(name = "id") Short id) {
		return service.get(id);
	}
	public StaffDto insertStaff(StaffAddDto staffDto) {
		return service.insert(staffDto);
	}
	public StaffDto updateStaff(StaffUpdateDto staffDto) {
		return service.update(staffDto);
	}
	public Message deleteStaff(@WebParam(name = "id") Short id) {
		return service.delete(id);
	}
}
