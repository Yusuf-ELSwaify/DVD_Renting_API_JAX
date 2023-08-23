package org.example.persistence.repositories;

import org.example.persistence.models.Country;

public class CountryRepository extends CRUDRepository<Country, Integer> {
	public static final CountryRepository INSTANCE = new CountryRepository();
	private CountryRepository() {
		super(Country.class);
	}
}
