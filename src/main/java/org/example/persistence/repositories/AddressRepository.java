package org.example.persistence.repositories;

import org.example.persistence.models.Address;

public class AddressRepository extends CRUDRepository<Address, Integer> {
	public static final AddressRepository INSTANCE = new AddressRepository();
	private AddressRepository() {
		super(Address.class);
	}
}
