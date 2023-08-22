package org.example.persistence.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.persistence.configurations.JpaManager;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class CRUDRepository<T, Id> extends ReadRepository<T, Id> {
	protected CRUDRepository(Class<T> entityClass) {
		super(entityClass);
	}
	public final T insert(T obj) {
		Consumer<EntityManager> consumer = entityManager -> entityManager.persist(obj);
		executeInTransaction(consumer);
		return obj;
	}
	public final T update(T obj) {
		Consumer<EntityManager> consumer = entityManager -> entityManager.merge(obj);
		executeInTransaction(consumer);
		return obj;
	}
	public final void delete(T obj) {
		Consumer<EntityManager> consumer = entityManager -> entityManager.remove(obj);
		executeInTransaction(consumer);
	}
	protected final void executeInTransaction(Consumer<EntityManager> consumer) {
		EntityManager entityManager = JpaManager.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			consumer.accept(entityManager);
			transaction.commit();
		} catch (RuntimeException e) {
			transaction.rollback();
			throw e;
		}
	}
	protected final <R> R executeInTransaction(Function<EntityManager, R> function) {
		EntityManager entityManager = JpaManager.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			R result = function.apply(entityManager);
			transaction.commit();
			return result;
		} catch (RuntimeException e) {
			transaction.rollback();
			throw e;
		}
	}
}
