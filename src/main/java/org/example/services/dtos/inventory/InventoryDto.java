package org.example.services.dtos.inventory;

import lombok.Value;
import org.example.persistence.models.Inventory;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.film.FilmDto;
import org.example.services.dtos.store.StoreDto;

import java.time.Instant;

/**
 * DTO for {@link org.example.persistence.models.Inventory}
 */
@Value
public class InventoryDto implements ReaderDto<Inventory> {
	Integer id;
	FilmDto film;
	StoreDto store;
	Instant lastUpdate;
}