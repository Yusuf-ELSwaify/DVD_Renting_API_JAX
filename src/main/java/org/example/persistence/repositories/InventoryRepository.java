package org.example.persistence.repositories;

import org.example.persistence.models.Inventory;

public class InventoryRepository extends CRUDRepository<Inventory, Integer> {
	public InventoryRepository() {
		super(Inventory.class);
	}
}
