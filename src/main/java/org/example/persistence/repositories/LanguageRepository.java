package org.example.persistence.repositories;

import org.example.persistence.models.Language;

public class LanguageRepository extends CRUDRepository<Language, Short> {
	public static final LanguageRepository INSTANCE = new LanguageRepository();
	private LanguageRepository() {
		super(Language.class);
	}
}
