package org.example.business.services;

import org.example.persistence.models.Film;
import org.example.persistence.models.views.FilmList;
import org.example.persistence.repositories.FilmRepository;
import org.example.persistence.repositories.views.FilmListRepository;
import org.example.business.dtos.film.*;
import org.example.business.mappers.FilmMapper;

public class FilmService extends DefaultService<Film, Integer, FilmDto, FilmAddDto, FilmUpdateDto> {
	public static final FilmService INSTANCE = new FilmService();

	private FilmService() {
		super(FilmRepository.INSTANCE, FilmMapper.INSTANCE);
	}

	/**
	 * @param id id of the film.
	 * @return The film and its actors.
	 */
	public FilmWithActorsDto getFilmWithActors(Integer id) {
		return FilmMapper.INSTANCE.toFilmWithActorsDto(getEntity(id));
	}
	/**
	 * @param id id of the film.
	 * @return The film and the categories of it.
	 */
	public FilmWithCategories getFilmWithCategories(Integer id) {
		return FilmMapper.INSTANCE.toFilmWithCategoriesDto(getEntity(id));
	}
	/**
	 * @param id id of the film.
	 * @return The film and the stores renting it.
	 */
	public FilmWithRentingStores getFilmWithRentingStores(Integer id) {
		return FilmMapper.INSTANCE.toFilmWithStores(getEntity(id));
	}
	/**
	 * @param id id of the film.
	 * @return The film and its rental details.
	 */
	public FilmWithRentals getFilmWithRentals(Integer id) {
		return FilmMapper.INSTANCE.getFilmWithRentals(getEntity(id));
	}
	/**
	 * @param id id of the film.
	 * @return The film details.
	 */
	public FilmList getFilmList(Integer id) {
		return getEntity(FilmListRepository.INSTANCE, id);
	}
}
