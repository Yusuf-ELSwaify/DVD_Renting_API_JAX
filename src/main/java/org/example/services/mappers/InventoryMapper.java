package org.example.services.mappers;

import org.example.persistence.models.Inventory;
import org.example.services.dtos.inventory.InventoryAddDto;
import org.example.services.dtos.inventory.InventoryDto;
import org.example.services.dtos.inventory.InventoryUpdateDeleteDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {FilmMapper.class, StoreMapper.class})
public interface InventoryMapper extends GenericMapper<Inventory, InventoryDto, InventoryAddDto, InventoryUpdateDeleteDto, InventoryUpdateDeleteDto> {
	InventoryMapper INSTANCE = Mappers.getMapper(InventoryMapper.class);
}