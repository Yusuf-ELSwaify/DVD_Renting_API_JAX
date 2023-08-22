package org.example.persistence.repositories;

import org.example.persistence.models.Film;

public class FilmRepository extends CRUDRepository<Film, Integer> {
	public FilmRepository() {
		super(Film.class);
	}
}
