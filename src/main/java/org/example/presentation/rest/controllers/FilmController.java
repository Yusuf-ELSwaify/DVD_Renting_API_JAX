package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.film.*;
import org.example.business.services.FilmService;

@Path("film")
@Produces(MediaType.APPLICATION_JSON)
public class FilmController {
	private static final FilmService service = FilmService.INSTANCE;
	@GET
	public Response getList(@DefaultValue("0") @QueryParam("from") int offset,
								   @DefaultValue("" + Integer.MAX_VALUE) @QueryParam("limit") int limit) {
		return Response.ok().entity(service.getList(offset, limit)).build();
	}

	@GET
	@Path("{id}")
	public Response get(@PathParam("id") Integer id) {
		return Response.ok().entity(service.get(id)).build();
	}

	@POST
	public Response insert(FilmAddDto filmDto) {
		return Response.ok().entity(service.insert(filmDto)).build();
	}

	@PUT
	public Response update(FilmUpdateDto filmDto) {
		return Response.ok().entity(service.update(filmDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}


	@GET
	@Path("actors/{id}")
	public Response getFilmWithActors(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getFilmWithActors(id)).build();
	}
	@GET
	@Path("categories/{id}")
	public Response getFilmWithCategories(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getFilmWithCategories(id)).build();
	}
	@GET
	@Path("stores/{id}")
	public Response getFilmWithRentingStores(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getFilmWithRentingStores(id)).build();
	}
	@GET
	@Path("rentals/{id}")
	public Response getFilmWithRentals(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getFilmWithRentals(id)).build();
	}
	@GET
	@Path("list/{id}")
	public Response getFilmListView(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getFilmList(id)).build();
	}
}
