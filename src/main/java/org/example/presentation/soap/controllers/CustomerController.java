package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.customer.CustomerAddDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.customer.CustomerUpdateDto;
import org.example.business.dtos.customer.CustomerWithRentedFilmsDto;
import org.example.business.dtos.messages.Message;
import org.example.business.mappers.CustomerMapper;
import org.example.business.services.CustomerService;
import org.example.persistence.models.views.CustomerList;
import org.example.persistence.repositories.views.CustomerListRepository;

import java.util.List;

@WebService
public class CustomerController {
	private static final CustomerService service = CustomerService.INSTANCE;
	
	public List<CustomerDto> getCustomerList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public CustomerDto getCustomer(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public CustomerDto insertCustomer(CustomerAddDto customerDto) {
		return service.insert(customerDto);
	}
	public CustomerDto updateCustomer(CustomerUpdateDto customerDto) {
		return service.update(customerDto);
	}
	public Message deleteCustomer(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}

	public CustomerWithRentedFilmsDto getCustomerWithRentedFilms(@WebParam(name = "id") Integer id) {
		return service.getCustomerWithRentedFilms(id);
	}
	public CustomerList getCustomerListView(@WebParam(name = "id") Integer id) {
		return service.getCustomerList(id);
	}
}
