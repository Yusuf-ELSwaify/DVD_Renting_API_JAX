package org.example.business.services;

import org.example.persistence.models.Store;
import org.example.persistence.models.views.SalesByStore;
import org.example.persistence.repositories.StoreRepository;
import org.example.persistence.repositories.views.SalesByStoreRepository;
import org.example.business.dtos.store.*;
import org.example.business.mappers.StoreMapper;

import java.util.List;

public class StoreService extends DefaultService<Store, Short, StoreDto, StoreAddDto, StoreUpdateDto> {
	public static final StoreService INSTANCE = new StoreService();
	private StoreService() {
		super(StoreRepository.INSTANCE, StoreMapper.INSTANCE);
	}
	/**
	 * @param id id of the store.
	 * @return The store and its customers.
	 */
	public StoreWithCustomersDto getStoreWithCustomers(Short id) {
		return StoreMapper.INSTANCE.toStoreWithCustomersDto(getEntity(id));
	}
	/**
	 * @param id id of the store.
	 * @return The store and films it contains.
	 */
	public StoreWithFilmsDto getStoreWithFilms(Short id) {
		return StoreMapper.INSTANCE.toStoreWithFilmsDto(getEntity(id));
	}
	/**
	 * @param storeName name of the store (city,country).
	 * @return The store and its total sales.
	 */
	public SalesByStore getSalesByStore(String storeName) {
		return getEntity(SalesByStoreRepository.INSTANCE, storeName);
	}
	/**
	 * @return All stores and its total sales.
	 */
	public List<SalesByStore> getAllStoresSales() {
		return getListEntity(SalesByStoreRepository.INSTANCE, 0, Integer.MAX_VALUE);
	}
}
