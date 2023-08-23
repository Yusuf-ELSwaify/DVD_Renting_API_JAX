package org.example.persistence.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
@Setter
@Getter
@ToString
@Entity
@Table(name = "address")
public class Address implements Model {
	@Id
	@Column(name = "address_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "address", nullable = false, length = 50)
	private String address;

	@Column(name = "address2", length = 50)
	private String address2;

	@Column(name = "district", nullable = false, length = 20)
	private String district;

	@ManyToOne(optional = false)
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

	@Column(name = "postal_code", length = 10)
	private String postalCode;

	@Column(name = "phone", nullable = false, length = 20)
	private String phone;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

	/*
    TODO [JPA Buddy] create field to map the 'location' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "location", columnDefinition = "geometry(0, 0) not null")
    private Object location;
*/
}