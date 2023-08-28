package org.example.business.dtos.inventory;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Inventory;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.film.FilmDto;
import org.example.business.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Inventory}
 */
@Data
@NoArgsConstructor
public class InventoryAddDto implements AdderDto<Inventory> {
	FilmDto film;
	StoreDto store;
}