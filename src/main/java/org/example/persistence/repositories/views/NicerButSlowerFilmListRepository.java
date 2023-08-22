package org.example.persistence.repositories.views;

import org.example.persistence.models.views.NicerButSlowerFilmList;
import org.example.persistence.repositories.ReadRepository;

public class NicerButSlowerFilmListRepository extends ReadRepository<NicerButSlowerFilmList, Integer> {
	public NicerButSlowerFilmListRepository() {
		super(NicerButSlowerFilmList.class);
	}
}
