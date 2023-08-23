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
@Table(name = "sales_by_store")
public class SalesByStore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store", length = 101)
	private String store;

	@Column(name = "manager", length = 91)
	private String manager;

	@Column(name = "total_sales", precision = 27, scale = 2)
	private BigDecimal totalSales;

	protected SalesByStore() {
	}
}