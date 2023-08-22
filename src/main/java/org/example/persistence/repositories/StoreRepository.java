package org.example.persistence.repositories;

import org.example.persistence.models.Store;

public class StoreRepository extends CRUDRepository<Store, Short> {
	public StoreRepository() {
		super(Store.class);
	}
}
