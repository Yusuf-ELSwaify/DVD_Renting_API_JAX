package org.example.business.dtos.store;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Store;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.film.FilmDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.util.Date;
import java.util.Set;

/**
 * DTO for {@link Store}
 */
@Data
@NoArgsConstructor
public class StoreWithFilmsDto {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
	Set<FilmDto> storeFilms;
	Date lastUpdate;
}