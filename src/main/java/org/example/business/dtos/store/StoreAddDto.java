package org.example.business.dtos.store;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.business.dtos.staff.StaffSummaryDto;
import org.example.persistence.models.Store;
import org.example.business.dtos.AdderDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.staff.StaffAddDto;


/**
 * DTO for {@link org.example.persistence.models.Store}
 */
@Data
@NoArgsConstructor
public class StoreAddDto implements AdderDto<Store> {
	StaffSummaryDto managerStaff;
	AddressDto address;
}