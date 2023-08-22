package org.example.persistence.repositories;

import org.example.persistence.models.Country;

public class CountryRepository extends CRUDRepository<Country, Integer> {
	public CountryRepository() {
		super(Country.class);
	}
}
