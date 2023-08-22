package org.example.persistence.repositories;

import org.example.persistence.models.Rental;

public class RentalRepository extends CRUDRepository<Rental, Integer> {
	public RentalRepository() {
		super(Rental.class);
	}
}
