package org.example.services;

import org.example.persistence.models.Rental;
import org.example.persistence.repositories.RentalRepository;
import org.example.services.dtos.rental.RentalAddDto;
import org.example.services.dtos.rental.RentalDto;
import org.example.services.dtos.rental.RentalSummaryDto;
import org.example.services.dtos.rental.RentalUpdateDeleteDto;
import org.example.services.mappers.RentalMapper;

public class RentalService extends DefaultService<Rental, Integer, RentalDto, RentalAddDto, RentalUpdateDeleteDto, RentalUpdateDeleteDto> {
	public static final RentalService INSTANCE = new RentalService();
	private RentalService() {
		super(RentalRepository.INSTANCE, RentalMapper.INSTANCE);
	}
}
