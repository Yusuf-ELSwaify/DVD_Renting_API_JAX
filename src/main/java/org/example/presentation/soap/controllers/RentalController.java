package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.messages.Message;
import org.example.business.dtos.rental.RentalAddDto;
import org.example.business.dtos.rental.RentalDto;
import org.example.business.dtos.rental.RentalUpdateDto;
import org.example.business.services.RentalService;

import java.util.List;

@WebService
public class RentalController {
	private static final RentalService service = RentalService.INSTANCE;
	
	public List<RentalDto> getRentalList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public RentalDto getRental(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public RentalDto insertRental(RentalAddDto rentalDto){
		return service.insert(rentalDto);
	}
	public RentalDto updateRental(RentalUpdateDto rentalDto){
		return service.update(rentalDto);
	}
	public Message deleteRental(@WebParam(name = "id") Integer id){
		return service.delete(id);
	}
}
