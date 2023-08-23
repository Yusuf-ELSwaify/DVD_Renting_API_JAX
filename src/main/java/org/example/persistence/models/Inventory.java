package org.example.persistence.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@Entity
@Table(name = "inventory")
public class Inventory implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id", nullable = false)
	private Integer id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "film_id", nullable = false)
	private Film film;

	@ManyToOne(optional = false)
	@JoinColumn(name = "store_id", nullable = false)
	private Store store;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

	@OneToMany(mappedBy = "inventory")
	private Set<Rental> rentals = new LinkedHashSet<>();

}