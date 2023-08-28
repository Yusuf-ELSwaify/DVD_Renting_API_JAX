package org.example.persistence.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
@Setter
@Getter
@ToString
@Entity
@Table(name = "payment")
public class Payment implements Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@ManyToOne(optional = false)
	@JoinColumn(name = "staff_id", nullable = false)
	private Staff staff;

	@ManyToOne
	@JoinColumn(name = "rental_id")
	private Rental rental;

	@Column(name = "amount", nullable = false, precision = 5, scale = 2)
	private BigDecimal amount;

	@Column(name = "payment_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date paymentDate;

	@Column(name = "last_update")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate = Date.from(Instant.now());

}