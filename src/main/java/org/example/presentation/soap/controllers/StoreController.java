package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.messages.Message;
import org.example.business.dtos.store.*;
import org.example.business.mappers.StoreMapper;
import org.example.business.services.StoreService;
import org.example.persistence.models.views.SalesByStore;
import org.example.persistence.repositories.views.SalesByStoreRepository;

import java.util.List;

@WebService
public class StoreController {
	private static final StoreService service = StoreService.INSTANCE;
	
	public List<StoreDto> getStoreList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public StoreDto getStore(@WebParam(name = "id") Short id) {
		return service.get(id);
	}
	public StoreDto insertStore(StoreAddDto storeDto) {
		return service.insert(storeDto);
	}
	public StoreDto updateStore(StoreUpdateDto storeDto) {
		return service.update(storeDto);
	}
	public Message deleteStore(@WebParam(name = "id") Short id) {
		return service.delete(id);
	}

	public StoreWithCustomersDto getStoreWithCustomers(@WebParam(name = "id") Short id) {
		return service.getStoreWithCustomers(id);
	}
	public StoreWithFilmsDto getStoreWithFilms(@WebParam(name = "id") Short id) {
		return service.getStoreWithFilms(id);
	}
	public SalesByStore getSalesByStore(@WebParam(name = "storeName") String storeName) {
		return service.getSalesByStore(storeName);
	}
	public List<SalesByStore> getAllStoresSales() {
		return service.getAllStoresSales();
	}
}
