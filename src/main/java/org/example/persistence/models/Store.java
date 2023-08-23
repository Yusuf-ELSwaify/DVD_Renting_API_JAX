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
@Table(name = "store")
public class Store implements Model {
	@Id
	@Column(name = "store_id", columnDefinition = "tinyint UNSIGNED not null")
	private Short id;

	@OneToOne(optional = false)
	@JoinColumn(name = "manager_staff_id", nullable = false)
	private Staff managerStaff;

	@ManyToOne(optional = false)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

	@OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
	@ToString.Exclude
	private Set<Customer> customers = new LinkedHashSet<>();

	@OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
	@ToString.Exclude
	private Set<Inventory> inventories = new LinkedHashSet<>();

	@OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
	@ToString.Exclude
	private Set<Staff> staff = new LinkedHashSet<>();

	@ManyToMany
	@JoinTable(name = "inventory", catalog = "sakila",
			joinColumns = @JoinColumn(name = "store_id"),
			inverseJoinColumns = @JoinColumn(name = "film_id"))
	@ToString.Exclude
	private Set<Film> films = new LinkedHashSet();

}