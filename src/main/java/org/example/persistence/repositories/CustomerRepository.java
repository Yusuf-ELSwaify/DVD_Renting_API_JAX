package org.example.persistence.repositories;

import org.example.persistence.models.Customer;

public class CustomerRepository extends CRUDRepository<Customer, Integer> {
	public static final CustomerRepository INSTANCE = new CustomerRepository();
	private CustomerRepository() {
		super(Customer.class);
	}
}
