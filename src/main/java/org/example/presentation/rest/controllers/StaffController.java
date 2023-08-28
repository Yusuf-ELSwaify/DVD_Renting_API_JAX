package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.staff.StaffAddDto;
import org.example.business.dtos.staff.StaffUpdateDto;
import org.example.business.services.StaffService;

@Path("staff")
@Produces(MediaType.APPLICATION_JSON)
public class StaffController {
	private static final StaffService service = StaffService.INSTANCE;
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
	public Response insert(StaffAddDto staffDto) {
		return Response.ok().entity(service.insert(staffDto)).build();
	}

	@PUT
	public Response update(StaffUpdateDto staffDto) {
		return Response.ok().entity(service.update(staffDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Short id) {
		return Response.ok().entity(service.delete(id)).build();
	}
}
