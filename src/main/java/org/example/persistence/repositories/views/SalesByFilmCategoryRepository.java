package org.example.persistence.repositories.views;

import org.example.persistence.models.views.SalesByFilmCategory;
import org.example.persistence.repositories.ReadRepository;

public class SalesByFilmCategoryRepository extends ReadRepository<SalesByFilmCategory, String> {
	public SalesByFilmCategoryRepository() {
		super(SalesByFilmCategory.class);
	}
}
