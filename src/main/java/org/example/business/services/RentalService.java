package org.example.business.services;

import org.example.business.dtos.rental.RentalUpdateDto;
import org.example.persistence.models.Rental;
import org.example.persistence.repositories.RentalRepository;
import org.example.business.dtos.rental.RentalAddDto;
import org.example.business.dtos.rental.RentalDto;
import org.example.business.mappers.RentalMapper;

public class RentalService extends DefaultService<Rental, Integer, RentalDto, RentalAddDto, RentalUpdateDto> {
	public static final RentalService INSTANCE = new RentalService();
	private RentalService() {
		super(RentalRepository.INSTANCE, RentalMapper.INSTANCE);
	}
}
