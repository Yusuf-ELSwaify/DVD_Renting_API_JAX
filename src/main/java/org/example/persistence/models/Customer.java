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
@Table(name = "customer")
public class Customer implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "store_id", nullable = false)
	private Store store;

	@Column(name = "first_name", nullable = false, length = 45)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 45)
	private String lastName;

	@Column(name = "email", length = 50)
	private String email;

	@ManyToOne(optional = false)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;

	@Column(name = "active", nullable = false)
	private Boolean active = false;

	@Column(name = "create_date", nullable = false)
	private Instant createDate = Instant.now();

	@Column(name = "last_update")
	private Instant lastUpdate = Instant.now();

	@OneToMany(mappedBy = "customer")
	private Set<Payment> payments = new LinkedHashSet<>();

	@OneToMany(mappedBy = "customer")
	private Set<Rental> rentals = new LinkedHashSet<>();

}