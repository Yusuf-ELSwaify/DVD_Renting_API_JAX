package org.example.services;


import org.example.persistence.models.Actor;
import org.example.persistence.models.views.ActorInfo;
import org.example.persistence.repositories.ActorRepository;
import org.example.persistence.repositories.ReadRepository;
import org.example.persistence.repositories.views.ActorInfoRepository;
import org.example.services.dtos.actor.*;
import org.example.services.exceptions.EntityNotFoundException;
import org.example.services.mappers.ActorMapper;

import java.util.List;

public class ActorService extends DefaultService <Actor, Integer, ActorDto, ActorAddDto, ActorUpdateDeleteDto, ActorUpdateDeleteDto> {

	public static final ActorService INSTANCE = new ActorService();
	private ActorService() {
		super(ActorRepository.INSTANCE, ActorMapper.INSTANCE);
	}
	/**
	 * @param id id of the actor.
	 * @return The actor and the films he did.
	 */
	public ActorWithFilmsDto getActorWithFilms(Integer id) {
		return ActorMapper.INSTANCE.toActorWithFilmsDto(getEntity(id));
	}

	/**
	 * @param id id of the actor.
	 * @return The actor and the films categories he did.
	 */
	public ActorWithCategoriesDto getActorWithCategories(Integer id) {
		return ActorMapper.INSTANCE.toActorWithCategoriesDto(getEntity(id));
	}
	/**
	 * @param id id of the actor.
	 * @return The actor with its details.
	 */
	public ActorInfo getActorInfo(Integer id) {
		return getEntity(ActorInfoRepository.INSTANCE, id);
	}
}
