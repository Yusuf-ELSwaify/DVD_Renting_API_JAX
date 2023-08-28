package org.example.business.services;

import org.example.business.dtos.customer.CustomerUpdateDto;
import org.example.persistence.models.Customer;
import org.example.persistence.models.views.CustomerList;
import org.example.persistence.repositories.CustomerRepository;
import org.example.persistence.repositories.views.CustomerListRepository;
import org.example.business.dtos.customer.CustomerAddDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.customer.CustomerWithRentedFilmsDto;
import org.example.business.mappers.CustomerMapper;

public class CustomerService extends DefaultService<Customer, Integer, CustomerDto, CustomerAddDto, CustomerUpdateDto> {
	public static final CustomerService INSTANCE = new CustomerService();
	private CustomerService() {
		super(CustomerRepository.INSTANCE, CustomerMapper.INSTANCE);
	}
	/**
	 * @param id id of the customer.
	 * @return The customer and the films he rented.
	 */
	public CustomerWithRentedFilmsDto getCustomerWithRentedFilms(Integer id) {
		return CustomerMapper.INSTANCE.toCustomerWithRentedFilmsDto(getEntity(id));
	}
	/**
	 * @param id id of the customer.
	 * @return The customer details.
	 */
	public CustomerList getCustomerList(Integer id) {
		return getEntity(CustomerListRepository.INSTANCE, id);
	}
}
