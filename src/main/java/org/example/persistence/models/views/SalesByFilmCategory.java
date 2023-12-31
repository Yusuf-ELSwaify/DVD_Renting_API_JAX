package org.example.persistence.models.views;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@ToString
@Entity
@Immutable
@Table(name = "sales_by_film_category")
public class SalesByFilmCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category", nullable = false, length = 25)
	private String category;

	@Column(name = "total_sales", precision = 27, scale = 2)
	private BigDecimal totalSales;

	protected SalesByFilmCategory() {
	}
}