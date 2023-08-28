package org.example.business.services;

import org.example.persistence.models.Category;
import org.example.persistence.models.views.SalesByFilmCategory;
import org.example.persistence.repositories.CategoryRepository;
import org.example.persistence.repositories.views.SalesByFilmCategoryRepository;
import org.example.business.dtos.Category.CategoryAddDto;
import org.example.business.dtos.Category.CategoryDto;
import org.example.business.dtos.Category.CategoryUpdateDto;
import org.example.business.dtos.Category.CategoryWithFilmsDto;
import org.example.business.mappers.CategoryMapper;

import java.util.List;

public class CategoryService extends DefaultService<Category, Short, CategoryDto, CategoryAddDto, CategoryUpdateDto> {
	public static final CategoryService INSTANCE = new CategoryService();
	private CategoryService() {
		super(CategoryRepository.INSTANCE, CategoryMapper.INSTANCE);
	}
	/**
	 * @param id category id.
	 * @return The category and the films of this category.
	 */
	public CategoryWithFilmsDto getCategoryWithFilms(Short id) {
		return CategoryMapper.INSTANCE.toCategoryWithFilmsDto(getEntity(id));
	}

	/**
	 * @param category name of the category.
	 * @return The category and its total sales.
	 */
	public SalesByFilmCategory getSalesByFilmCategory(String category) {
		return getEntity(SalesByFilmCategoryRepository.INSTANCE, category);
	}
	/**
	 * @return All categories and its total sales.
	 */
	public List<SalesByFilmCategory> getAllSalesByFilmCategory() {
		return getListEntity(SalesByFilmCategoryRepository.INSTANCE, 0, Integer.MAX_VALUE);
	}
}
