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
@Table(name = "category")
public class Category implements Model {
	@Id
	@Column(name = "category_id", columnDefinition = "tinyint UNSIGNED not null")
	private Short id;

	@Column(name = "name", nullable = false, length = 25)
	private String name;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

	@ManyToMany
	@JoinTable(name = "film_category",
			joinColumns = @JoinColumn(name = "category_id"),
			inverseJoinColumns = @JoinColumn(name = "film_id"))
	@ToString.Exclude
	private Set<Film> films = new LinkedHashSet<>();

}