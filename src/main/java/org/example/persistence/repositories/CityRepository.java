package org.example.persistence.repositories;

import org.example.persistence.models.City;

public class CityRepository extends CRUDRepository<City, Integer> {
	public static final CityRepository INSTANCE = new CityRepository();
	private CityRepository() {
		super(City.class);
	}
}
