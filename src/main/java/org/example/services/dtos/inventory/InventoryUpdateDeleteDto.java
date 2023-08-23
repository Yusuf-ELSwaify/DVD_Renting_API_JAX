package org.example.services.dtos.inventory;

import lombok.Value;
import org.example.persistence.models.Inventory;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.dtos.film.FilmDto;
import org.example.services.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Inventory}
 */
@Value
public class InventoryUpdateDeleteDto implements UpdaterDto<Inventory>, DeleterDto<Inventory> {
	Integer id;
	FilmDto film;
	StoreDto store;
}