package org.example.services.mappers;

import org.example.persistence.models.Store;
import org.example.services.dtos.store.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {StaffMapper.class})
public interface StoreMapper extends GenericMapper<Store, StoreDto, StoreAddDto, StoreUpdateDeleteDto, StoreUpdateDeleteDto> {
	StoreMapper INSTANCE = Mappers.getMapper(StoreMapper.class);

	StoreWithCustomersDto toStoreWithCustomersDto(Store store);
	StoreWithFilmsDto toStoreWithFilmsDto(Store store);

}