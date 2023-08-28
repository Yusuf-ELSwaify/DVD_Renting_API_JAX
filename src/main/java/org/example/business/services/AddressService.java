package org.example.business.services;

import org.example.business.dtos.address.AddressUpdateDto;
import org.example.persistence.models.Address;
import org.example.persistence.repositories.AddressRepository;
import org.example.business.dtos.address.AddressAddDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.mappers.AddressMapper;

public class AddressService extends DefaultService<Address, Integer, AddressDto, AddressAddDto, AddressUpdateDto> {
	public static final AddressService INSTANCE = new AddressService();
	private AddressService() {
		super(AddressRepository.INSTANCE, AddressMapper.INSTANCE);
	}
}
