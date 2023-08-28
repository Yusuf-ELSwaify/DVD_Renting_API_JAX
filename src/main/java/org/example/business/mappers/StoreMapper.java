package org.example.business.mappers;

import org.example.persistence.models.Store;
import org.example.business.dtos.store.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {StaffMapper.class})
public interface StoreMapper extends GenericMapper<Store, StoreDto, StoreAddDto, StoreUpdateDto> {
	StoreMapper INSTANCE = Mappers.getMapper(StoreMapper.class);

	@Mapping(source = "customers", target = "storeCustomers")
	StoreWithCustomersDto toStoreWithCustomersDto(Store store);
	@Mapping(source = "films", target = "storeFilms")
	StoreWithFilmsDto toStoreWithFilmsDto(Store store);

}