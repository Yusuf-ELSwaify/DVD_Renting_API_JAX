package org.example.persistence.repositories;

import org.example.persistence.models.Rental;

public class RentalRepository extends CRUDRepository<Rental, Integer> {
	public static final RentalRepository INSTANCE = new RentalRepository();
	private RentalRepository() {
		super(Rental.class);
	}
}
