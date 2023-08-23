package org.example.persistence.repositories;

import org.example.persistence.models.Inventory;

public class InventoryRepository extends CRUDRepository<Inventory, Integer> {
	public static final InventoryRepository INSTANCE = new InventoryRepository();
	private InventoryRepository() {
		super(Inventory.class);
	}
}
