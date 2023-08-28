package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.inventory.InventoryAddDto;
import org.example.business.dtos.inventory.InventoryDto;
import org.example.business.dtos.inventory.InventoryUpdateDto;
import org.example.business.dtos.messages.Message;
import org.example.business.services.InventoryService;

import java.util.List;

@WebService
public class InventoryController {
	private static final InventoryService service = InventoryService.INSTANCE;
	
	public List<InventoryDto> getInventoryList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public InventoryDto getInventory(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public InventoryDto insertInventory(InventoryAddDto inventoryDto) {
		return service.insert(inventoryDto);
	}
	public InventoryDto updateInventory(InventoryUpdateDto inventoryDto) {
		return service.update(inventoryDto);
	}
	public Message deleteInventory(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}
}
