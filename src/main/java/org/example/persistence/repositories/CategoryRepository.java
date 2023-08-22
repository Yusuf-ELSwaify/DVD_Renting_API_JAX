package org.example.persistence.repositories;

import org.example.persistence.models.Category;

public class CategoryRepository extends CRUDRepository<Category, Short> {
	public CategoryRepository() {
		super(Category.class);
	}
}
