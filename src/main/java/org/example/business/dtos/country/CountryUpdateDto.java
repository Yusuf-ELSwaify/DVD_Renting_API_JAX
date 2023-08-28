package org.example.business.dtos.country;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.persistence.models.Country;
import org.example.business.dtos.UpdaterDto;


/**
 * DTO for {@link org.example.persistence.models.Country}
 */
@Data
@NoArgsConstructor
public class CountryUpdateDto implements UpdaterDto<Country>, java.io.Serializable {
	@NotNull
	Integer id;
	String country;
}