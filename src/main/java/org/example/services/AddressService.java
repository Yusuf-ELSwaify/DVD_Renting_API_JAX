package org.example.services;

import org.example.persistence.models.Address;
import org.example.persistence.repositories.AddressRepository;
import org.example.services.dtos.address.AddressAddDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.address.AddressUpdateDeleteDto;
import org.example.services.mappers.AddressMapper;

public class AddressService extends DefaultService<Address, Integer, AddressDto, AddressAddDto, AddressUpdateDeleteDto, AddressUpdateDeleteDto> {
	public static final AddressService INSTANCE = new AddressService();
	private AddressService() {
		super(AddressRepository.INSTANCE, AddressMapper.INSTANCE);
	}
}
