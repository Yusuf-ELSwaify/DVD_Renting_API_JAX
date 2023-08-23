package org.example.persistence.repositories.views;

import org.example.persistence.models.views.SalesByStore;
import org.example.persistence.repositories.ReadRepository;

public class SalesByStoreRepository extends ReadRepository<SalesByStore, String> {
	public static final SalesByStoreRepository INSTANCE = new SalesByStoreRepository();
	private SalesByStoreRepository() {
		super(SalesByStore.class);
	}
}
