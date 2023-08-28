package org.example.persistence.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Setter
@Getter
@ToString
@Entity
@Table(name = "film_text")
public class FilmText implements Model {
	@Id
	@Column(name = "film_id", unique = true, nullable = false)
	private Short id;

	@Column(name = "title", nullable = false)
	private String title;

	@Lob
	@Column(name = "description")
	private String description;

}