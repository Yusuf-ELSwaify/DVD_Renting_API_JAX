package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.city.CityAddDto;
import org.example.business.dtos.city.CityUpdateDto;
import org.example.business.services.CityService;

@Path("city")
@Produces(MediaType.APPLICATION_JSON)
public class CityController {
	private static final CityService service = CityService.INSTANCE;
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
	public Response insert(CityAddDto cityDto) {
		return Response.ok().entity(service.insert(cityDto)).build();
	}

	@PUT
	public Response update(CityUpdateDto cityDto) {
		return Response.ok().entity(service.update(cityDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}
}
