package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.Category.CategoryAddDto;
import org.example.business.dtos.Category.CategoryUpdateDto;
import org.example.business.services.CategoryService;

@Path("category")
@Produces(MediaType.APPLICATION_JSON)
public class CategoryController {
	private static final CategoryService service = CategoryService.INSTANCE;
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
	public Response insert(CategoryAddDto categoryDto) {
		return Response.ok().entity(service.insert(categoryDto)).build();
	}


	@PUT
	public Response update(CategoryUpdateDto categoryDto) {
		return Response.ok().entity(service.update(categoryDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Short id) {
		return Response.ok().entity(service.delete(id)).build();
	}


	@GET
	@Path("films/{id}")
	public Response getCategoryWithFilms(@PathParam("id") Short id) {
		return Response.ok().entity(service.getCategoryWithFilms(id)).build();
	}
	@GET
	@Path("sales/{category}")
	public Response getSalesByFilmCategory(@PathParam("category") String category) {
		return Response.ok().entity(service.getSalesByFilmCategory(category)).build();
	}
	@GET
	@Path("sales")
	public Response getAllSalesByFilmCategory() {
		return Response.ok().entity(service.getAllSalesByFilmCategory()).build();
	}
}
