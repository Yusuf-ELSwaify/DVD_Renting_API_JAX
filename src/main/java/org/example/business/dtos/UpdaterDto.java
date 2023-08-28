package org.example.business.dtos;

import org.example.persistence.models.Model;

import java.io.Serializable;

public interface UpdaterDto<T extends Model> extends Serializable {
	<Id> Id getId();
}
