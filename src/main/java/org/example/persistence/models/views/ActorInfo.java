package org.example.persistence.models.views;

import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@ToString
@Entity
@Immutable
@Table(name = "actor_info")
public class ActorInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actor_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer actorId;

	@Column(name = "first_name", nullable = false, length = 45)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 45)
	private String lastName;

	@Lob
	@Column(name = "film_info")
	private String filmInfo;

	public Integer getActorId() {
		return actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFilmInfo() {
		return filmInfo;
	}

	protected ActorInfo() {
	}
}