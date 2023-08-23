package org.example.services.dtos.customer;

import lombok.Value;
import org.example.persistence.models.Customer;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.film.FilmDto;
import org.example.services.dtos.store.StoreDto;

import java.time.Instant;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link Customer}
 */
@Value
public class CustomerWithRentedFilmsDto {
	Integer id;
	String firstName;
	String lastName;
	String email;
	AddressDto address;
	Boolean active;
	Set<FilmDto> rentedFilms;
	Instant createDate;
	Instant lastUpdate;
}