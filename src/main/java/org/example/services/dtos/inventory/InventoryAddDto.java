package org.example.services.dtos.inventory;

import lombok.Value;
import org.example.persistence.models.Inventory;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.film.FilmDto;
import org.example.services.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Inventory}
 */
@Value
public class InventoryAddDto implements AdderDto<Inventory> {
	FilmDto film;
	StoreDto store;
}