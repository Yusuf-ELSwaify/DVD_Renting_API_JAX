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
@Table(name = "country")
public class Country implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "country", nullable = false, length = 50)
	private String country;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

}