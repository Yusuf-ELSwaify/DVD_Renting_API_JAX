package org.example.business.mappers;

import org.example.persistence.models.Category;
import org.example.business.dtos.Category.CategoryAddDto;
import org.example.business.dtos.Category.CategoryDto;
import org.example.business.dtos.Category.CategoryUpdateDto;
import org.example.business.dtos.Category.CategoryWithFilmsDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper extends GenericMapper<Category, CategoryDto, CategoryAddDto, CategoryUpdateDto> {
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

	CategoryWithFilmsDto toCategoryWithFilmsDto(Category category);
}