package org.example.services.dtos.store;

import lombok.Value;
import org.example.persistence.models.Store;
import org.example.services.dtos.AdderDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.staff.StaffAddDto;


/**
 * DTO for {@link org.example.persistence.models.Store}
 */
@Value
public class StoreAddDto implements AdderDto<Store> {
	StaffAddDto managerStaff;
	AddressDto address;
}