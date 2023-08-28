package org.example.presentation.soap.controllers;


import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.business.dtos.actor.*;
import org.example.business.dtos.messages.Message;
import org.example.business.services.ActorService;
import org.example.persistence.models.views.ActorInfo;

import java.util.List;

@WebService
public class ActorController {

	private static final ActorService service = ActorService.INSTANCE;
	public List<ActorDto> getActorList(@WebParam(name = "from") int offset, @WebParam(name = "limit") int limit) {
		return service.getList(offset, limit == 0 ? Integer.MAX_VALUE : limit);
	}
	public ActorDto getActor(@WebParam(name = "id") Integer id) {
		return service.get(id);
	}
	public ActorDto insertActor(ActorAddDto actorDto) {
		return service.insert(actorDto);
	}
	public ActorDto updateActor(ActorUpdateDto actorDto) {
		return service.update(actorDto);
	}
	public Message deleteActor(@WebParam(name = "id") Integer id) {
		return service.delete(id);
	}

	public ActorWithFilmsDto getActorWithFilms(@WebParam(name = "id") Integer id) {
		return service.getActorWithFilms(id);
	}

	public ActorWithCategoriesDto getActorWithCategories(@WebParam(name = "id") Integer id) {
		return service.getActorWithCategories(id);
	}

	public ActorInfo getActorInfo(@WebParam(name = "id") Integer id) {
		return service.getActorInfo(id);
	}

}
