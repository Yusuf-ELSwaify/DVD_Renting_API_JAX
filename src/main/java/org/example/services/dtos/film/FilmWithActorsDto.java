package org.example.services.dtos.film;

import lombok.Value;
import org.example.persistence.models.Actor;
import org.example.services.dtos.actor.ActorDto;
import org.example.services.dtos.language.LanguageDto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;
@Value
public class FilmWithActorsDto implements Serializable {
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
	Set<ActorDto> actors;
}
