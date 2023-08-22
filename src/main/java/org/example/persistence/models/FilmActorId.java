package org.example.persistence.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;
@ToString
@Embeddable
public class FilmActorId implements Serializable {
	private static final long serialVersionUID = 7893568610663192166L;
	@Column(name = "actor_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer actorId;

	@Column(name = "film_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer filmId;

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		FilmActorId entity = (FilmActorId) o;
		return Objects.equals(this.actorId, entity.actorId) &&
				Objects.equals(this.filmId, entity.filmId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(actorId, filmId);
	}

}