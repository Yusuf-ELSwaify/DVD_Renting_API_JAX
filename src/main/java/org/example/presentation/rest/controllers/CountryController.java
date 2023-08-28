package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.country.CountryAddDto;
import org.example.business.dtos.country.CountryUpdateDto;
import org.example.business.services.CountryService;

@Path("country")
@Produces(MediaType.APPLICATION_JSON)
public class CountryController {
	private static final CountryService service = CountryService.INSTANCE;
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
	public Response insert(CountryAddDto countryDto) {
		return Response.ok().entity(service.insert(countryDto)).build();
	}

	@PUT
	public Response update(CountryUpdateDto countryDto) {
		return Response.ok().entity(service.update(countryDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}
}
