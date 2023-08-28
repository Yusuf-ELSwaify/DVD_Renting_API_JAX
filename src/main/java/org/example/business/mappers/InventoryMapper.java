package org.example.business.mappers;

import org.example.business.dtos.inventory.InventoryUpdateDto;
import org.example.persistence.models.Inventory;
import org.example.business.dtos.inventory.InventoryAddDto;
import org.example.business.dtos.inventory.InventoryDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {FilmMapper.class, StoreMapper.class})
public interface InventoryMapper extends GenericMapper<Inventory, InventoryDto, InventoryAddDto, InventoryUpdateDto> {
	InventoryMapper INSTANCE = Mappers.getMapper(InventoryMapper.class);
}