package org.example.persistence.models.views;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@Getter
@ToString
@Entity
@Immutable
@Table(name = "nicer_but_slower_film_list")
public class NicerButSlowerFilmList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FID", columnDefinition = "smallint UNSIGNED")
	private Integer fid;

	@Column(name = "title", length = 128)
	private String title;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "category", nullable = false, length = 25)
	private String category;

	@Column(name = "price", precision = 4, scale = 2)
	private BigDecimal price;

	@Column(name = "length", columnDefinition = "smallint UNSIGNED")
	private Integer length;

	@Lob
	@Column(name = "rating")
	private String rating;

	@Lob
	@Column(name = "actors")
	private String actors;

	protected NicerButSlowerFilmList() {
	}
}