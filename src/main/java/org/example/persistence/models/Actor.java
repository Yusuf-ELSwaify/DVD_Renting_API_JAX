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
@Table(name = "actor")
public class Actor implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "actor_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "first_name", nullable = false, length = 45)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 45)
	private String lastName;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();
	@ManyToMany(mappedBy = "actors")
	@ToString.Exclude
	private Set<Film> films = new LinkedHashSet();

}