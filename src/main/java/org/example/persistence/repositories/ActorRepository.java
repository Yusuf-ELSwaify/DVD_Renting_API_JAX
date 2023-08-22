package org.example.persistence.repositories;

import org.example.persistence.models.Actor;

public class ActorRepository extends CRUDRepository<Actor, Integer> {
	public ActorRepository() {
		super(Actor.class);
	}
}
