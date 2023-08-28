package org.example.presentation.rest.exceptions_mappers;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.example.business.dtos.messages.Message;
import org.example.business.dtos.messages.Messages;
import org.example.business.exceptions.EntityNotFoundException;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<EntityNotFoundException> {

	public static final int ERROR_CODE = 404;

	@Override
	public Response toResponse(EntityNotFoundException e) {
		Message errorMessage = Messages.createMessage(e.getMessage(), ERROR_CODE, "Object not found");
		return Response.status(ERROR_CODE).entity(errorMessage).build();
	}
}
