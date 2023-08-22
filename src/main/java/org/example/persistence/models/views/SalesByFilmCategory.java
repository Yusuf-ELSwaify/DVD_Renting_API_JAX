package org.example.persistence.models.views;

import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
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

	public String getCategory() {
		return category;
	}

	public BigDecimal getTotalSales() {
		return totalSales;
	}

	protected SalesByFilmCategory() {
	}
}