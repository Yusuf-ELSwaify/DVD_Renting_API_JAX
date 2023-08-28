package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.Category.CategoryAddDto;
import org.example.business.dtos.Category.CategoryDto;
import org.example.business.dtos.Category.CategoryUpdateDto;
import org.example.business.dtos.Category.CategoryWithFilmsDto;
import org.example.business.dtos.messages.Message;
import org.example.business.mappers.CategoryMapper;
import org.example.business.services.CategoryService;
import org.example.persistence.models.views.SalesByFilmCategory;
import org.example.persistence.repositories.views.SalesByFilmCategoryRepository;

import java.util.List;

@WebService
public class CategoryController {
	private static final CategoryService service = CategoryService.INSTANCE;
	
	public List<CategoryDto> getCategoryList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public CategoryDto getCategory(@WebParam(name = "id") Short id) {
		return service.get(id);
	}
	public CategoryDto insertCategory(CategoryAddDto categoryDto) {
		return service.insert(categoryDto);
	}
	public CategoryDto updateCategory(CategoryUpdateDto categoryDto) {
		return service.update(categoryDto);
	}
	public Message deleteCategory(@WebParam(name = "id") Short id) {
		return service.delete(id);
	}

	public CategoryWithFilmsDto getCategoryWithFilms(@WebParam(name = "id") Short id) {
		return service.getCategoryWithFilms(id);
	}
	public SalesByFilmCategory getSalesByFilmCategory(@WebParam(name = "category") String category) {
		return service.getSalesByFilmCategory(category);
	}
	public List<SalesByFilmCategory> getAllSalesByFilmCategory() {
		return service.getAllSalesByFilmCategory();
	}
}
