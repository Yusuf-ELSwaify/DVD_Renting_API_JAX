package org.example.persistence.repositories.views;

import org.example.persistence.models.views.SalesByFilmCategory;
import org.example.persistence.repositories.ReadRepository;

public class SalesByFilmCategoryRepository extends ReadRepository<SalesByFilmCategory, String> {
	public static final SalesByFilmCategoryRepository INSTANCE = new SalesByFilmCategoryRepository();
	private SalesByFilmCategoryRepository() {
		super(SalesByFilmCategory.class);
	}
}
