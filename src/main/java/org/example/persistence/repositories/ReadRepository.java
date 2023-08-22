package org.example.persistence.repositories;

import jakarta.persistence.EntityManager;
import org.example.persistence.configurations.JpaManager;

import java.util.List;
import java.util.Optional;

public class ReadRepository<T, Id> {
	protected Class<T> entityClass;
	protected ReadRepository(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	public final List<T> findAll() {
		return findEntitiesWithLimit(0, Integer.MAX_VALUE);
	}
	public final List<T> findEntitiesWithLimit(int offset, int limit) {
		String jpql = "FROM " + entityClass.getSimpleName() + " o";
		EntityManager entityManager = JpaManager.getEntityManager();
		return entityManager.createQuery(jpql, entityClass)
				.setFirstResult(offset)
				.setMaxResults(limit)
				.getResultList();
	}
	public final Optional<T> find(Id id) {
		EntityManager entityManager = JpaManager.getEntityManager();
		return Optional.ofNullable(entityManager.find(entityClass, id));
	}
}
