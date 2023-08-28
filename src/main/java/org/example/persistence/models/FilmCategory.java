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
@Table(name = "film_category")
public class FilmCategory {
	@EmbeddedId
	private FilmCategoryId id;

	@MapsId("filmId")
	@ManyToOne(optional = false)
	@JoinColumn(name = "film_id", nullable = false)
	private Film film;

	@MapsId("categoryId")
	@ManyToOne(optional = false)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	@Column(name = "last_update", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate = Date.from(Instant.now());

}