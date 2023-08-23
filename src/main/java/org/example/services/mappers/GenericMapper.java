package org.example.services.mappers;

import org.example.persistence.models.Model;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.UpdaterDto;

import java.util.List;


public interface GenericMapper<T extends Model, DTO extends ReaderDto<T>, AddDTO extends AdderDto<T>, UpdateDTO extends UpdaterDto<T>, DeleteDTO extends DeleterDto<T>> {
	T toEntity(DTO dto);
	DTO toDto(T entity);

	T fromAddDtoToEntity(AddDTO addDto);
	AddDTO toAddDto(T entity);

	T fromUpdateDtoToEntity(UpdateDTO updateDto);
	UpdateDTO toUpdateDto(T entity);

	T fromDeleteDtoToEntity(DeleteDTO deleteDTO);
	DeleteDTO toDeleteDto(T entity);

	List<DTO> toDtoList(List<T> entities);

}