package org.example.persistence.repositories;

import org.example.persistence.models.Store;

public class StoreRepository extends CRUDRepository<Store, Short> {
	public static final StoreRepository INSTANCE = new StoreRepository();
	private StoreRepository() {
		super(Store.class);
	}
}
