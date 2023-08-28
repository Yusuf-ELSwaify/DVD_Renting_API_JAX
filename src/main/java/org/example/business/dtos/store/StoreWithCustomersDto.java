package org.example.business.dtos.store;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.example.persistence.models.Store;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.customer.CustomerDto;
import org.example.business.dtos.staff.StaffSummaryDto;

import java.util.Date;
import java.util.Set;

/**
 * DTO for {@link Store}
 */
@Data
@NoArgsConstructor
public class StoreWithCustomersDto {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
	Set<CustomerDto> storeCustomers;
	Date lastUpdate;
}