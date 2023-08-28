package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.city.CityAddDto;
import org.example.business.dtos.city.CityDto;
import org.example.business.dtos.city.CityUpdateDto;
import org.example.business.dtos.messages.Message;
import org.example.business.services.CityService;

import java.util.List;

@WebService
public class CityController {
	private static final CityService service = CityService.INSTANCE;
	
	public List<CityDto> getCityList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public CityDto getCity(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public CityDto insertCity(CityAddDto cityDto) {
		return service.insert(cityDto);
	}
	public CityDto updateCity(CityUpdateDto cityDto) {
		return service.update(cityDto);
	}
	public Message deleteCity(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}
}
