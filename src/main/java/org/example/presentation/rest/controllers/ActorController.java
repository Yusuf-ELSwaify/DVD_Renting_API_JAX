package org.example.presentation.rest.controllers;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.actor.ActorAddDto;
import org.example.business.dtos.actor.ActorUpdateDto;
import org.example.business.services.ActorService;

@Path("actor")
@Produces(MediaType.APPLICATION_JSON)
public class ActorController {

	private static final ActorService service = ActorService.INSTANCE;

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
	public Response insert(ActorAddDto actorDto) {
		return Response.ok().entity(service.insert(actorDto)).build();
	}

	@PUT
	public Response update(ActorUpdateDto actorDto) {
		return Response.ok().entity(service.update(actorDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}

	@Path("films/{id}")
	@GET
	public Response getWithFilms(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getActorWithFilms(id)).build();
	}

	@Path("categories/{id}")
	@GET
	public Response getWithCategories(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getActorWithCategories(id)).build();
	}
	@Path("info/{id}")
	@GET
	public Response getActorInfo(@PathParam("id") Integer id) {
		return Response.ok().entity(service.getActorInfo(id)).build();
	}

}
