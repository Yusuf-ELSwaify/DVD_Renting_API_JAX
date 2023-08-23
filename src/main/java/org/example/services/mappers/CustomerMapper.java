package org.example.services.mappers;

import org.example.persistence.models.Customer;
import org.example.persistence.models.Inventory;
import org.example.persistence.models.Rental;
import org.example.services.dtos.customer.CustomerAddDto;
import org.example.services.dtos.customer.CustomerDto;
import org.example.services.dtos.customer.CustomerUpdateDeleteDto;
import org.example.services.dtos.customer.CustomerWithRentedFilmsDto;
import org.example.services.dtos.film.FilmDto;
import org.example.services.dtos.rental.RentalSummaryDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {StoreMapper.class, AddressMapper.class})
public interface CustomerMapper extends GenericMapper<Customer, CustomerDto, CustomerAddDto, CustomerUpdateDeleteDto, CustomerUpdateDeleteDto> {
	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
	@Mapping(source = "rentals", target = "rentedFilms", qualifiedByName = "getFilmRentals")
	CustomerWithRentedFilmsDto toCustomerWithRentedFilmsDto(Customer customer);
	@Named("getFilmRentals")
	default Set<FilmDto> getFilmRentals(Set<Rental> rentals) {
		return rentals.stream()
				.map(Rental::getInventory)
				.map(Inventory::getFilm)
				.map(FilmMapper.INSTANCE::toDto)
				.collect(Collectors.toSet());
	}
}