package org.example.persistence.repositories;

import org.example.persistence.models.FilmText;

public class FilmTextRepository extends CRUDRepository<FilmText, Short> {
	public static final FilmTextRepository INSTANCE = new FilmTextRepository();
	private FilmTextRepository() {
		super(FilmText.class);
	}
}
