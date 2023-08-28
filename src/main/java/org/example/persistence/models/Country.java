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
@Table(name = "country")
public class Country implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "country", nullable = false, length = 50)
	private String country;

	@Column(name = "last_update", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate = Date.from(Instant.now());

}