package org.example.business.mappers;

import org.example.business.dtos.address.AddressDto;
import org.example.persistence.models.Model;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.UpdaterDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;


public interface GenericMapper<T extends Model, DTO extends ReaderDto<T>, AddDTO extends AdderDto<T>, UpdateDTO extends UpdaterDto<T>> {
	T toEntity(DTO dto);
	DTO toDto(T entity);

	T fromAddDtoToEntity(AddDTO addDto);
	AddDTO toAddDto(T entity);


	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	UpdateDTO partialUpdate(UpdateDTO updateDto, @MappingTarget UpdateDTO completeUpdateDTO);
	UpdateDTO toUpdateDto(T entity);
	T fromUpdateDtoToEntity(UpdateDTO addDto);


	List<DTO> toDtoList(List<T> entities);

}