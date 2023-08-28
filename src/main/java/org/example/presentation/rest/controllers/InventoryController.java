package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.inventory.InventoryAddDto;
import org.example.business.dtos.inventory.InventoryUpdateDto;
import org.example.business.services.InventoryService;

@Path("inventory")
@Produces(MediaType.APPLICATION_JSON)
public class InventoryController {
	private static final InventoryService service = InventoryService.INSTANCE;
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
	public Response insert(InventoryAddDto inventoryDto) {
		return Response.ok().entity(service.insert(inventoryDto)).build();
	}

	@PUT
	public Response update(InventoryUpdateDto inventoryDto) {
		return Response.ok().entity(service.update(inventoryDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}
}
