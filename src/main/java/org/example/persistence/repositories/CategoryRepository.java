package org.example.persistence.repositories;

import org.example.persistence.models.Category;

public class CategoryRepository extends CRUDRepository<Category, Short> {
	public static final CategoryRepository INSTANCE = new CategoryRepository();
	private CategoryRepository() {
		super(Category.class);
	}
}
