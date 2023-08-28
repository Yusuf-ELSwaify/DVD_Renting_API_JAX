package org.example.presentation.rest.controllers;

import jakarta.jws.WebParam;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.store.StoreAddDto;
import org.example.business.dtos.store.StoreUpdateDto;
import org.example.business.dtos.store.StoreWithCustomersDto;
import org.example.business.dtos.store.StoreWithFilmsDto;
import org.example.business.services.StoreService;
import org.example.persistence.models.views.SalesByStore;

import java.util.List;

@Path("store")
@Produces(MediaType.APPLICATION_JSON)
public class StoreController {
	private static final StoreService service = StoreService.INSTANCE;
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
	public Response insert(StoreAddDto storeDto) {
		return Response.ok().entity(service.insert(storeDto)).build();
	}

	@PUT
	public Response update(StoreUpdateDto storeDto) {
		return Response.ok().entity(service.update(storeDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Short id) {
		return Response.ok().entity(service.delete(id)).build();
	}


	@GET
	@Path("customers/{id}")
	public StoreWithCustomersDto getStoreWithCustomers(@PathParam("id") Short id) {
		return service.getStoreWithCustomers(id);
	}
	@GET
	@Path("films/{id}")
	public StoreWithFilmsDto getStoreWithFilms(@PathParam("id") Short id) {
		return service.getStoreWithFilms(id);
	}
	@GET
	@Path("sales/{storeName}")
	public SalesByStore getSalesByStore(@PathParam("storeName") String storeName) {
		return service.getSalesByStore(storeName);
	}
	@GET
	@Path("sales")
	public List<SalesByStore> getAllStoresSales() {
		return service.getAllStoresSales();
	}
}
