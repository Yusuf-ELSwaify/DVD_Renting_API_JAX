package org.example.presentation.rest.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.business.dtos.payment.PaymentAddDto;
import org.example.business.dtos.payment.PaymentUpdateDto;
import org.example.business.services.PaymentService;

@Path("payment")
@Produces(MediaType.APPLICATION_JSON)
public class PaymentController {
	private static final PaymentService service = PaymentService.INSTANCE;
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
	public Response insert(PaymentAddDto paymentDto) {
		return Response.ok().entity(service.insert(paymentDto)).build();
	}

	@PUT
	public Response update(PaymentUpdateDto paymentDto) {
		return Response.ok().entity(service.update(paymentDto)).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer id) {
		return Response.ok().entity(service.delete(id)).build();
	}
}
