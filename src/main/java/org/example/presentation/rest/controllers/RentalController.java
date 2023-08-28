package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.rental.RentalAddDto;
import org.example.business.dtos.rental.RentalUpdateDto;
import org.example.business.services.RentalService;

@Path("rental")
@Produces(MediaType.APPLICATION_JSON)
public class RentalController {
	private static final RentalService service = RentalService.INSTANCE;
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
	public Response insert(RentalAddDto rentalDto) {
		return Response.ok().entity(service.insert(rentalDto)).build();
	}

	@PUT
	public Response update(RentalUpdateDto rentalDto) {
		return Response.ok().entity(service.update(rentalDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}
}
