package org.example.persistence.configurations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class JpaManager {
	private final static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("moviesPersistence");
	private final static ThreadLocal<EntityManager> threadLocal =
			ThreadLocal.withInitial(entityManagerFactory::createEntityManager);

	public static EntityManager getEntityManager(){
		return threadLocal.get();
	}
	public static void close() {
		entityManagerFactory.close();
	}

}
