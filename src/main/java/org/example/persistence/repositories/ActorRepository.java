package org.example.persistence.repositories;

import org.example.persistence.models.Actor;

public class ActorRepository extends CRUDRepository<Actor, Integer> {
	public static final ActorRepository INSTANCE = new ActorRepository();
	private ActorRepository() {
		super(Actor.class);
	}
}
