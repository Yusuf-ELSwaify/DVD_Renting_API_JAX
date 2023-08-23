package org.example.services;


import org.example.persistence.models.Model;
import org.example.persistence.repositories.CRUDRepository;
import org.example.persistence.repositories.ReadRepository;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.exceptions.EntityNotFoundException;
import org.example.services.mappers.GenericMapper;

import java.util.List;

public class DefaultService<T extends Model, Id, DTO extends ReaderDto<T>, AddDTO extends AdderDto<T>, UpdateDTO extends UpdaterDto<T>, DeleteDTO extends DeleterDto<T>> {
	CRUDRepository<T, Id> repository;
	GenericMapper<T, DTO, AddDTO, UpdateDTO, DeleteDTO> mapper;

	public DefaultService(CRUDRepository<T, Id> repository, GenericMapper<T, DTO, AddDTO, UpdateDTO, DeleteDTO> mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	public List<DTO> getList(int offset, int limit) {
		return mapper.toDtoList(repository.findEntitiesWithLimit(offset, limit));
	}
	public DTO get(Id id) {
		return mapper.toDto(getEntity(id));
	}
	public AddDTO insert(AddDTO addDTO) {
		T entity = mapper.fromAddDtoToEntity(addDTO);
		insert(entity);
		return mapper.toAddDto(entity);
	}
	public UpdateDTO update(UpdateDTO updateDTO) {
		T entity = mapper.fromUpdateDtoToEntity(updateDTO);
		update(entity);
		return mapper.toUpdateDto(entity);
	}
	public DeleteDTO delete(DeleteDTO deleteDTO) {
		T entity = mapper.fromDeleteDtoToEntity(deleteDTO);
		delete(entity);
		return mapper.toDeleteDto(entity);
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
	protected void delete(T entity) {
		delete(repository, entity);
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
	protected static <T extends Model, Id> void delete(CRUDRepository<T, Id> repository, T entity) {
		repository.delete(entity);
	}
}
