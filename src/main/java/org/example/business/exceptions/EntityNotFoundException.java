package org.example.business.exceptions;

public class EntityNotFoundException extends RuntimeException {
	public EntityNotFoundException(String msg) {
		super(msg);
	}
}
