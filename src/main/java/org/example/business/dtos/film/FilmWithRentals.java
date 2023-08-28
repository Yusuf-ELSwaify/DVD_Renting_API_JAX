package org.example.business.dtos.film;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.business.dtos.language.LanguageDto;
import org.example.business.dtos.rental.RentalSummaryDto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
public class FilmWithRentals {
	Integer id;
	String title;
	String description;
	Integer releaseYear;
	LanguageDto language;
	LanguageDto originalLanguage;
	Short rentalDuration;
	BigDecimal rentalRate;
	Integer length;
	BigDecimal replacementCost;
	String rating;
	String specialFeatures;
	Date lastUpdate;
	Set<RentalSummaryDto> filmRentalDetails;
}
