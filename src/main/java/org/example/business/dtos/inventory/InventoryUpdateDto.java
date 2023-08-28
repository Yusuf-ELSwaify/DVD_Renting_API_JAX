package org.example.business.dtos.inventory;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Inventory;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.film.FilmDto;
import org.example.business.dtos.store.StoreDto;


/**
 * DTO for {@link org.example.persistence.models.Inventory}
 */
@Data
@NoArgsConstructor
public class InventoryUpdateDto implements UpdaterDto<Inventory>, java.io.Serializable {
	@NotNull
	Integer id;
	FilmDto film;
	StoreDto store;
}