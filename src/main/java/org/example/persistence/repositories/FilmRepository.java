package org.example.persistence.repositories;

import org.example.persistence.models.Film;

public class FilmRepository extends CRUDRepository<Film, Integer> {
	public static final FilmRepository INSTANCE = new FilmRepository();
	private FilmRepository() {
		super(Film.class);
	}
}
