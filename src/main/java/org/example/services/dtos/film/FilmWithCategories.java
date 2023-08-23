package org.example.services.dtos.film;

import lombok.Value;
import org.example.services.dtos.Category.CategoryDto;
import org.example.services.dtos.language.LanguageDto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;
@Value
public class FilmWithCategories {
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
	Set<CategoryDto> filmCategories;
}
