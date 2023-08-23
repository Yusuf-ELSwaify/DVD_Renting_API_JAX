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
@Table(name = "film_actor")
public class FilmActor {
	@EmbeddedId
	private FilmActorId id;

	@MapsId("actorId")
	@ManyToOne(optional = false)
	@JoinColumn(name = "actor_id", nullable = false)
	private Actor actor;

	@MapsId("filmId")
	@ManyToOne(optional = false)
	@JoinColumn(name = "film_id", nullable = false)
	private Film film;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate = Instant.now();

}