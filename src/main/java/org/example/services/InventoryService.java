package org.example.services;

import org.example.persistence.models.Inventory;
import org.example.persistence.repositories.InventoryRepository;
import org.example.services.dtos.inventory.InventoryAddDto;
import org.example.services.dtos.inventory.InventoryDto;
import org.example.services.dtos.inventory.InventoryUpdateDeleteDto;
import org.example.services.mappers.InventoryMapper;

public class InventoryService extends DefaultService<Inventory, Integer, InventoryDto, InventoryAddDto, InventoryUpdateDeleteDto, InventoryUpdateDeleteDto> {
	public static final InventoryService INSTANCE = new InventoryService();
	private InventoryService() {
		super(InventoryRepository.INSTANCE, InventoryMapper.INSTANCE);
	}
}
