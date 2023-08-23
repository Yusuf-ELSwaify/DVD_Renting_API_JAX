package org.example.services.dtos.film;

import lombok.Value;
import org.example.services.dtos.language.LanguageDto;
import org.example.services.dtos.store.StoreDto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;

@Value
public class FilmWithRentingStores {
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
	Instant lastUpdate;
	Set<StoreDto> RentingStores;
}
