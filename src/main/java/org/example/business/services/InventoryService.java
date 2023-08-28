package org.example.business.services;

import org.example.persistence.models.Inventory;
import org.example.persistence.repositories.InventoryRepository;
import org.example.business.dtos.inventory.InventoryAddDto;
import org.example.business.dtos.inventory.InventoryDto;
import org.example.business.dtos.inventory.InventoryUpdateDto;
import org.example.business.mappers.InventoryMapper;

public class InventoryService extends DefaultService<Inventory, Integer, InventoryDto, InventoryAddDto, InventoryUpdateDto> {
	public static final InventoryService INSTANCE = new InventoryService();
	private InventoryService() {
		super(InventoryRepository.INSTANCE, InventoryMapper.INSTANCE);
	}
}
