package org.example.business.dtos.inventory;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Inventory;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.film.FilmDto;
import org.example.business.dtos.store.StoreDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Inventory}
 */
@Data
@NoArgsConstructor
public class InventoryDto implements ReaderDto<Inventory> {
	Integer id;
	FilmDto film;
	StoreDto store;
	Date lastUpdate;
}