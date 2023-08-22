package org.example.persistence.repositories;

import org.example.persistence.models.Language;

public class LanguageRepository extends CRUDRepository<Language, Short> {
	public LanguageRepository() {
		super(Language.class);
	}
}
