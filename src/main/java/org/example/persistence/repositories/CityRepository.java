package org.example.persistence.repositories;

import org.example.persistence.models.City;

public class CityRepository extends CRUDRepository<City, Integer> {
	public CityRepository() {
		super(City.class);
	}
}
