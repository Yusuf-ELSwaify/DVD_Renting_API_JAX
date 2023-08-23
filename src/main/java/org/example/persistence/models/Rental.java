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
@Table(name = "rental")
public class Rental implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rental_id", nullable = false)
	private Integer id;

	@Column(name = "rental_date", nullable = false)
	private Instant rentalDate;

	@ManyToOne(optional = false)
	@JoinColumn(name = "inventory_id", nullable = false)
	private Inventory inventory;

	@ManyToOne(optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@Column(name = "return_date")
	private Instant returnDate;

	@ManyToOne(optional = false)
	@JoinColumn(name = "staff_id", nullable = false)
	private Staff staff;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

}