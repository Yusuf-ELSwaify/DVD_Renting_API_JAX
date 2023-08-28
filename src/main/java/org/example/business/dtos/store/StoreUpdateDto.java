package org.example.business.dtos.store;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Store;
import org.example.business.dtos.UpdaterDto;
import org.example.business.dtos.address.AddressDto;
import org.example.business.dtos.staff.StaffSummaryDto;

/**
 * DTO for {@link org.example.persistence.models.Store}
 */
@Data
@NoArgsConstructor
public class StoreUpdateDto implements UpdaterDto<Store>, java.io.Serializable {
	Short id;
	StaffSummaryDto managerStaff;
	AddressDto address;
}