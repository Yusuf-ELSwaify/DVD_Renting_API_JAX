package org.example.persistence.models.views;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@ToString
@Entity
@Immutable
@Table(name = "customer_list")
public class CustomerList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "name", length = 91)
	private String name;

	@Column(name = "address", nullable = false, length = 50)
	private String address;

	@Column(name = "`zip code`", length = 10)
	private String zipCode;

	@Column(name = "phone", nullable = false, length = 20)
	private String phone;

	@Column(name = "city", nullable = false, length = 50)
	private String city;

	@Column(name = "country", nullable = false, length = 50)
	private String country;

	@Column(name = "notes", nullable = false, length = 6)
	private String notes;

	@Column(name = "SID", columnDefinition = "tinyint UNSIGNED not null")
	private Short sid;

	protected CustomerList() {
	}
}