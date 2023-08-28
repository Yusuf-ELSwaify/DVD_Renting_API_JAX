package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.address.AddressAddDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.address.AddressUpdateDto;
import org.example.business.dtos.messages.Message;
import org.example.business.services.AddressService;

import java.util.List;
@WebService
public class AddressController {
	private static final AddressService service = AddressService.INSTANCE;
	
	public List<AddressDto> getAddressList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public AddressDto getAddress(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public AddressDto insertAddress(AddressAddDto addressDto) {
		return service.insert(addressDto);
	}
	public AddressDto updateAddress(AddressUpdateDto addressDto) {
		return service.update(addressDto);
	}
	public Message deleteAddress(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}
}
