package org.example.presentation.soap.controllers;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.film.*;
import org.example.business.dtos.messages.Message;
import org.example.business.mappers.FilmMapper;
import org.example.business.services.FilmService;
import org.example.persistence.models.views.FilmList;
import org.example.persistence.repositories.views.FilmListRepository;

import java.util.List;

@WebService
public class FilmController {
	private static final FilmService service = FilmService.INSTANCE;
	
	public List<FilmDto> getFilmList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public FilmDto getFilm(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public FilmDto insertFilm(FilmAddDto filmDto) {
		return service.insert(filmDto);
	}
	public FilmDto updateFilm(FilmUpdateDto filmDto) {
		return service.update(filmDto);
	}
	public Message deleteFilm(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}


	public FilmWithActorsDto getFilmWithActors(@WebParam(name = "id") Integer id) {
		return service.getFilmWithActors(id);
	}
	public FilmWithCategories getFilmWithCategories(@WebParam(name = "id") Integer id) {
		return service.getFilmWithCategories(id);
	}
	public FilmWithRentingStores getFilmWithRentingStores(@WebParam(name = "id") Integer id) {
		return service.getFilmWithRentingStores(id);
	}
	public FilmWithRentals getFilmWithRentals(@WebParam(name = "id") Integer id) {
		return service.getFilmWithRentals(id);
	}
	public FilmList getFilmListView(@WebParam(name = "id") Integer id) {
		return service.getFilmList(id);
	}
}
