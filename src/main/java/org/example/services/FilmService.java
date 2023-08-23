package org.example.services;

import org.example.persistence.models.Film;
import org.example.persistence.models.views.FilmList;
import org.example.persistence.repositories.FilmRepository;
import org.example.persistence.repositories.FilmTextRepository;
import org.example.persistence.repositories.views.FilmListRepository;
import org.example.services.dtos.film.*;
import org.example.services.mappers.FilmMapper;

public class FilmService extends DefaultService<Film, Integer, FilmDto, FilmAddDto, FilmUpdateDeleteDto, FilmUpdateDeleteDto> {
	public static final FilmService INSTANCE = new FilmService();
	private final FilmTextRepository filmTextRepository = FilmTextRepository.INSTANCE;
	private FilmService() {
		super(FilmRepository.INSTANCE, FilmMapper.INSTANCE);
	}

	@Override
	public FilmAddDto insert(FilmAddDto filmAddDto) {
		Film film = mapper.fromAddDtoToEntity(filmAddDto);
		insert(film);
		filmTextRepository.insert(FilmMapper.INSTANCE.fromFilmToFilmText(film));
		return mapper.toAddDto(film);
	}

	@Override
	public FilmUpdateDeleteDto update(FilmUpdateDeleteDto updateDto) {
		Film film = mapper.fromUpdateDtoToEntity(updateDto);
		update(film);
		filmTextRepository.update(FilmMapper.INSTANCE.fromFilmToFilmText(film));
		return mapper.toUpdateDto(film);
	}

	@Override
	public FilmUpdateDeleteDto delete(FilmUpdateDeleteDto deleteDto) {
		Film film = mapper.fromDeleteDtoToEntity(deleteDto);
		delete(film);
		filmTextRepository.delete(FilmMapper.INSTANCE.fromFilmToFilmText(film));
		return mapper.toDeleteDto(film);
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
