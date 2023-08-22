package org.example.persistence.repositories.views;

import org.example.persistence.models.views.FilmList;
import org.example.persistence.repositories.ReadRepository;

public class FilmListRepository extends ReadRepository<FilmList, Integer> {
	public FilmListRepository() {
		super(FilmList.class);
	}
}
