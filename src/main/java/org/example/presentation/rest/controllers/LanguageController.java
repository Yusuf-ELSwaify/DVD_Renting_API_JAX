package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.language.LanguageAddDto;
import org.example.business.dtos.language.LanguageUpdateDto;
import org.example.business.services.LanguageService;

@Path("language")
@Produces(MediaType.APPLICATION_JSON)
public class LanguageController {
	private static final LanguageService service = LanguageService.INSTANCE;
	@GET
	public Response getList(@DefaultValue("0") @QueryParam("from") int offset,
								   @DefaultValue("" + Integer.MAX_VALUE) @QueryParam("limit") int limit) {
		return Response.ok().entity(service.getList(offset, limit)).build();
	}

	@GET
	@Path("{id}")
	public Response get(@PathParam("id") Short id) {
		return Response.ok().entity(service.get(id)).build();
	}

	@POST
	public Response insert(LanguageAddDto languageDto) {
		return Response.ok().entity(service.insert(languageDto)).build();
	}

	@PUT
	public Response update(LanguageUpdateDto languageDto) {
		return Response.ok().entity(service.update(languageDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Short id) {
		return Response.ok().entity(service.delete(id)).build();
	}

	@GET
	@Path("films/{id}")
	public Response getLanguageWithFilms(@PathParam("id") Short id) {
		return Response.ok().entity(service.getLanguageWithFilms(id)).build();
	}
}
