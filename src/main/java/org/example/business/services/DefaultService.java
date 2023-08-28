package org.example.business.services;


import org.example.business.dtos.messages.Message;
import org.example.business.dtos.messages.Messages;
import org.example.persistence.models.Model;
import org.example.persistence.repositories.CRUDRepository;
import org.example.persistence.repositories.ReadRepository;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.UpdaterDto;
import org.example.business.exceptions.EntityNotFoundException;
import org.example.business.mappers.GenericMapper;

import java.util.List;

public class DefaultService<T extends Model, Id, DTO extends ReaderDto<T>, AddDTO extends AdderDto<T>, UpdateDTO extends UpdaterDto<T>> {
	CRUDRepository<T, Id> repository;
	GenericMapper<T, DTO, AddDTO, UpdateDTO> mapper;

	public DefaultService(CRUDRepository<T, Id> repository, GenericMapper<T, DTO, AddDTO, UpdateDTO> mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	public List<DTO> getList(int offset, int limit) {
		return mapper.toDtoList(repository.findEntitiesWithLimit(offset, limit));
	}
	public DTO get(Id id) {
		return mapper.toDto(getEntity(id));
	}
	public DTO insert(AddDTO addDTO) {
		T entity = mapper.fromAddDtoToEntity(addDTO);
		insert(entity);
		return mapper.toDto(entity);
	}
	public DTO update(UpdateDTO updateDTO) {
		T entity = mapper.fromUpdateDtoToEntity(
				mapper.partialUpdate(
						updateDTO, mapper.toUpdateDto(getEntity(updateDTO.getId()))));
		update(entity);
		return mapper.toDto(entity);
	}
	public Message delete(Id id) {
		delete(repository, id);
		return Messages.DELETED_SUCCESSFULLY_MESSAGE;
	}


	protected List<T> getListEntity(int offset, int limit) {
		return getListEntity(repository, offset, limit);
	}
	protected T getEntity(Id id) {
		return getEntity(repository, id);
	}
	protected void insert(T entity) {
		insert(repository, entity);
	}
	protected void update(T entity) {
		update(repository, entity);
	}

	protected static <T, Id> List<T> getListEntity(ReadRepository<T, Id> repository, int offset, int limit) {
		return repository.findEntitiesWithLimit(offset, limit);
	}
	protected static <T, Id> T getEntity(ReadRepository<T, Id> repository, Id id) {
		return repository.find(id).orElseThrow(
				()-> new EntityNotFoundException("Not Found In DB"));
	}
	protected static <T extends Model, Id> void insert(CRUDRepository<T, Id> repository, T entity) {
		repository.insert(entity);
	}
	protected static <T extends Model, Id> void update(CRUDRepository<T, Id> repository, T entity) {
		repository.update(entity);
	}
	protected static <T extends Model, Id> void delete(CRUDRepository<T, Id> repository, Id id) {
		repository.delete(getEntity(repository, id));
	}
}
