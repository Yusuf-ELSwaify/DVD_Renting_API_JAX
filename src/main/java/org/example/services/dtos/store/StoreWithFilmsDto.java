package org.example.services.dtos.store;

import lombok.Value;
import org.example.persistence.models.Store;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.film.FilmDto;
import org.example.services.dtos.staff.StaffSummaryDto;

import java.time.Instant;
import java.util.Set;

/**
 * DTO for {@link Store}
 */
@Value
public class StoreWithFilmsDto {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
	Set<FilmDto> storeFilms;
	Instant lastUpdate;
}