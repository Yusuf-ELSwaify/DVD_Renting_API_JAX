package org.example.business.dtos;

import org.example.persistence.models.Model;

import java.io.Serializable;

public interface AdderDto<T extends Model> extends Serializable {
}
