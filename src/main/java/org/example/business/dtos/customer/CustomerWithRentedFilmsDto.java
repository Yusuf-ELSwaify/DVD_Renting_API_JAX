package org.example.business.dtos.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Customer;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.film.FilmDto;

import java.util.Date;
import java.util.Set;

/**
 * DTO for {@link Customer}
 */
@Data
@NoArgsConstructor
public class CustomerWithRentedFilmsDto {
	Integer id;
	String firstName;
	String lastName;
	String email;
	AddressDto address;
	Boolean active;
	Set<FilmDto> rentedFilms;
	Date createDate;
	Date lastUpdate;
}