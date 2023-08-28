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
@Table(name = "city")
public class City implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "city", nullable = false, length = 50)
	private String city;

	@ManyToOne(optional = false)
	@JoinColumn(name = "country_id", nullable = false)
	private Country country;

	@Column(name = "last_update", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate = Date.from(Instant.now());

}