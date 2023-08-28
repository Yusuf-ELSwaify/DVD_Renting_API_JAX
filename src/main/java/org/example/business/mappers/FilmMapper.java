package org.example.business.mappers;

import org.example.persistence.models.Film;
import org.example.persistence.models.FilmText;
import org.example.persistence.models.Inventory;
import org.example.business.dtos.film.*;
import org.example.business.dtos.rental.RentalSummaryDto;
import org.example.business.dtos.store.StoreDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {LanguageMapper.class})
public interface FilmMapper extends GenericMapper<Film, FilmDto, FilmAddDto, FilmUpdateDto> {
	FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

	FilmText fromFilmToFilmText(Film film);

	FilmWithActorsDto toFilmWithActorsDto(Film film);

	FilmWithCategories toFilmWithCategoriesDto(Film film);

	@Mapping(source = "inventories", target = "rentingStores", qualifiedByName = "inventoryStores")
	FilmWithRentingStores toFilmWithStores(Film film);

	@org.mapstruct.Named("inventoryStores")
	default Set<StoreDto> getinventoriesStores(Set<Inventory> inventories) {
		return inventories.stream()
				.map(Inventory::getStore)
				.map(StoreMapper.INSTANCE::toDto)
				.collect(Collectors.toSet());
	}
	@Mapping(source = "inventories", target = "filmRentalDetails", qualifiedByName = "filmRentals")
	FilmWithRentals getFilmWithRentals(Film film);

	@org.mapstruct.Named("filmRentals")
	default Set<RentalSummaryDto> getfilmRentals(Set<Inventory> inventories) {
		return inventories.stream()
				.map(Inventory::getRentals)
				.flatMap(rentals -> rentals.stream().
						map(RentalMapper.INSTANCE::getRentalSummaryDto))
				.collect(Collectors.toSet());
	}
}