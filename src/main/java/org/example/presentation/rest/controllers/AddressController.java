package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.address.AddressAddDto;
import org.example.business.dtos.address.AddressUpdateDto;
import org.example.business.services.AddressService;

@Path("address")
@Produces(MediaType.APPLICATION_JSON)
public class AddressController {
	private static final AddressService service = AddressService.INSTANCE;
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
	public Response insert(AddressAddDto addressDto) {
		return Response.ok().entity(service.insert(addressDto)).build();
	}


	@PUT
	public Response update(AddressUpdateDto addressDto) {
		return Response.ok().entity(service.update(addressDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}
}
