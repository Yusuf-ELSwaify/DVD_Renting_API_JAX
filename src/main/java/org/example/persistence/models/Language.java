package org.example.persistence.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

import java.time.Instant;
@ToString
@Entity
@Table(name = "language")
public class Language {
	@Id
	@Column(name = "language_id", columnDefinition = "tinyint UNSIGNED not null")
	private Short id;

	@Column(name = "name", nullable = false, length = 20)
	private String name;

	@Column(name = "last_update", nullable = false)
	private Instant lastUpdate;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}