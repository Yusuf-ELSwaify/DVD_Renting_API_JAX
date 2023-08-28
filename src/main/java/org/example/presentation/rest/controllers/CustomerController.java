package org.example.presentation.rest.controllers;

import jakarta.jws.WebParam;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.customer.CustomerAddDto;
import org.example.business.dtos.customer.CustomerUpdateDto;
import org.example.business.dtos.customer.CustomerWithRentedFilmsDto;
import org.example.business.services.CustomerService;
import org.example.persistence.models.views.CustomerList;

@Path("customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerController {
	private static final CustomerService service = CustomerService.INSTANCE;
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
	public Response insert(CustomerAddDto customerDto) {
		return Response.ok().entity(service.insert(customerDto)).build();
	}

	@PUT
	public Response update(CustomerUpdateDto customerDto) {
		return Response.ok().entity(service.update(customerDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}

	@GET
	@Path("rented_films/{id}")
	public CustomerWithRentedFilmsDto getCustomerWithRentedFilms(@PathParam("id") Integer id) {
		return service.getCustomerWithRentedFilms(id);
	}
	@GET
	@Path("list/{id}")
	public CustomerList getCustomerListView(@PathParam("id") Integer id) {
		return service.getCustomerList(id);
	}
}
