package org.example.business.dtos.store;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.business.dtos.staff.StaffDto;
import org.example.persistence.models.Store;
import org.example.business.dtos.ReaderDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.util.Date;

/**
 * DTO for {@link org.example.persistence.models.Store}
 */
@Data
@NoArgsConstructor
public class StoreDto implements ReaderDto<Store> {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
	Date lastUpdate;
}