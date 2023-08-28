package org.example.persistence.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "film")
public class Film implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "release_year")
	private Integer releaseYear;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "language_id", nullable = false)
	private Language language;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "original_language_id")
	private Language originalLanguage;

	@Column(name = "rental_duration", columnDefinition = "tinyint UNSIGNED not null")
	private Short rentalDuration;

	@Column(name = "rental_rate", nullable = false, precision = 4, scale = 2)
	private BigDecimal rentalRate;

	@Column(name = "length", columnDefinition = "smallint UNSIGNED")
	private Integer length;

	@Column(name = "replacement_cost", nullable = false, precision = 5, scale = 2)
	private BigDecimal replacementCost;

	@Lob
	@Column(name = "rating")
	private String rating;

	@Lob
	@Column(name = "special_features")
	private String specialFeatures;

	@Column(name = "last_update", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate = Date.from(Instant.now());


	@ManyToMany
	@JoinTable(name = "film_actor",
			joinColumns = @JoinColumn(name = "film_id"),
			inverseJoinColumns = @JoinColumn(name = "actor_id"))
	@ToString.Exclude
	private Set<Actor> actors = new LinkedHashSet();

	@ManyToMany
	@JoinTable(name = "film_category",
			joinColumns = @JoinColumn(name = "film_id"),
			inverseJoinColumns = @JoinColumn(name = "category_id"))
	@ToString.Exclude
	private Set<Category> categories = new LinkedHashSet<>();

	@OneToMany(mappedBy = "film", orphanRemoval = true)
	@ToString.Exclude
	private Set<Inventory> inventories = new LinkedHashSet<>();

}