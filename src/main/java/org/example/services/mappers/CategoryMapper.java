package org.example.services.mappers;

import org.example.persistence.models.Category;
import org.example.services.dtos.Category.CategoryAddDto;
import org.example.services.dtos.Category.CategoryDto;
import org.example.services.dtos.Category.CategoryUpdateDeleteDto;
import org.example.services.dtos.Category.CategoryWithFilmsDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper extends GenericMapper<Category, CategoryDto, CategoryAddDto, CategoryUpdateDeleteDto, CategoryUpdateDeleteDto> {
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

	CategoryWithFilmsDto toCategoryWithFilmsDto(Category category);
}