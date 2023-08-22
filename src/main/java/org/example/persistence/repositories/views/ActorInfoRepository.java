package org.example.persistence.repositories.views;

import org.example.persistence.models.views.ActorInfo;
import org.example.persistence.repositories.ReadRepository;

public class ActorInfoRepository extends ReadRepository<ActorInfo, Integer> {
	public ActorInfoRepository() {
		super(ActorInfo.class);
	}
}
