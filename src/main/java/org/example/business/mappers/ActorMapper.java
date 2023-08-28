package org.example.business.mappers;

import org.example.persistence.models.Actor;
import org.example.persistence.models.Film;
import org.example.business.dtos.Category.CategoryDto;
import org.example.business.dtos.actor.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {FilmMapper.class})
public interface ActorMapper extends GenericMapper<Actor, ActorDto, ActorAddDto, ActorUpdateDto> {
	ActorMapper INSTANCE = Mappers.getMapper(ActorMapper.class);

	@Mapping(source = "films", target = "actorFilms")
	ActorWithFilmsDto toActorWithFilmsDto(Actor actor);
	@Mapping(source = "films", target = "actorFilmsCategories", qualifiedByName = "getActorFilmsCategories")
	ActorWithCategoriesDto toActorWithCategoriesDto(Actor actor);

	@Named("getActorFilmsCategories")
	default Set<CategoryDto> getActorFilmsCategories(Set<Film> films) {
		return films.stream()
				.map(Film::getCategories)
				.flatMap(categories -> categories.stream()
						.map(CategoryMapper.INSTANCE::toDto))
				.collect(Collectors.toSet());
	}
}