package org.example.persistence.repositories;

import org.example.persistence.models.FilmText;

public class FilmTextRepository extends CRUDRepository<FilmText, Short> {
	public FilmTextRepository() {
		super(FilmText.class);
	}
}
