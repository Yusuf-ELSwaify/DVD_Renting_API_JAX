package org.example.persistence.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.Date;
@Setter
@Getter
@ToString
@Entity
@Table(name = "address")
public class Address implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Lob
	@Column(name = "location", columnDefinition = "geometry(0, 0) not null")
	private byte[] location = new byte[]{0, 0, 0, 0, 1, 1, 0, 0, 0, 62, 10, 50, 93, 99, 52, 92, -64, 118, 31, -37, -115, -103, -39, 72, 64};

	@Column(name = "last_update", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate = Date.from(Instant.now());


}