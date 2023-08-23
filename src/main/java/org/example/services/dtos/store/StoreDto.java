package org.example.services.dtos.store;

import lombok.Value;
import org.example.persistence.models.Store;
import org.example.services.dtos.ReaderDto;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.customer.CustomerDto;
import org.example.services.dtos.staff.StaffSummaryDto;

import java.time.Instant;
import java.util.Set;

/**
 * DTO for {@link org.example.persistence.models.Store}
 */
@Value
public class StoreDto implements ReaderDto<Store> {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
	Instant lastUpdate;
}