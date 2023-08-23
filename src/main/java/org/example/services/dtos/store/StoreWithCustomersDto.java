package org.example.services.dtos.store;

import lombok.Value;
import org.example.persistence.models.Store;
import org.example.services.dtos.address.AddressDto;
import org.example.services.dtos.customer.CustomerDto;
import org.example.services.dtos.staff.StaffSummaryDto;

import java.time.Instant;
import java.util.Set;

/**
 * DTO for {@link Store}
 */
@Value
public class StoreWithCustomersDto {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
	Set<CustomerDto> storeCustomers;
	Instant lastUpdate;
}