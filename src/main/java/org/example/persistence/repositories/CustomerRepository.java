package org.example.persistence.repositories;

import org.example.persistence.models.Customer;

public class CustomerRepository extends CRUDRepository<Customer, Integer> {
	public CustomerRepository() {
		super(Customer.class);
	}
}
