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
@Table(name = "language")
public class Language implements Model {
	@Id
	@Column(name = "language_id", columnDefinition = "tinyint UNSIGNED not null")
	private Short id;

	@Column(name = "name", nullable = false, length = 20)
	private String name;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

	@OneToMany(mappedBy = "language")
	@ToString.Exclude
	private Set<Film> films = new LinkedHashSet<>();

}