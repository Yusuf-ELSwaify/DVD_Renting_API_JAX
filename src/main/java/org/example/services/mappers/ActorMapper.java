package org.example.services.mappers;

import org.example.persistence.models.Actor;
import org.example.persistence.models.Film;
import org.example.services.dtos.Category.CategoryDto;
import org.example.services.dtos.actor.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {FilmMapper.class})
public interface ActorMapper extends GenericMapper<Actor, ActorDto, ActorAddDto, ActorUpdateDeleteDto, ActorUpdateDeleteDto> {
	ActorMapper INSTANCE = Mappers.getMapper(ActorMapper.class);


	ActorWithFilmsDto toActorWithFilmsDto(Actor actor);
	@Mapping(source = "films", target = "actorFilmsCategories", qualifiedByName = "getactorFilmsCategories")
	ActorWithCategoriesDto toActorWithCategoriesDto(Actor actor);

	@Named("getactorFilmsCategories")
	default Set<CategoryDto> getactorFilmsCategories(Set<Film> films) {
		return films.stream()
				.map(Film::getCategories)
				.flatMap(categories -> categories.stream()
						.map(CategoryMapper.INSTANCE::toDto))
				.collect(Collectors.toSet());
	}
}