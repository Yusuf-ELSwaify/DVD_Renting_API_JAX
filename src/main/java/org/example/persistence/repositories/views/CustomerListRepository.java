package org.example.persistence.repositories.views;

import org.example.persistence.models.views.CustomerList;
import org.example.persistence.repositories.ReadRepository;

public class CustomerListRepository extends ReadRepository<CustomerList, Integer> {
	public CustomerListRepository() {
		super(CustomerList.class);
	}
}
