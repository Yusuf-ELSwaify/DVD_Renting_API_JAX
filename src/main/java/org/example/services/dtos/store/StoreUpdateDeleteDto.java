package org.example.services.dtos.store;

import lombok.Value;
import org.example.persistence.models.Store;
import org.example.services.dtos.DeleterDto;
import org.example.services.dtos.UpdaterDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.staff.StaffSummaryDto;

/**
 * DTO for {@link org.example.persistence.models.Store}
 */
@Value
public class StoreUpdateDeleteDto implements UpdaterDto<Store>, DeleterDto<Store> {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
}