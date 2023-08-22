package org.example.persistence.repositories;

import org.example.persistence.models.Address;

public class AddressRepository extends CRUDRepository<Address, Integer> {
	public AddressRepository() {
		super(Address.class);
	}
}
