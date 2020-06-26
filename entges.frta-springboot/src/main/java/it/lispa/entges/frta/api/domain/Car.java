package it.lispa.entges.frta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import it.lispa.springline.entity.FilterableEntity;

@Entity
@Table(name = "CAR")
public class Car extends FilterableEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ_CAR")
	@SequenceGenerator(name = "SEQ_CAR", sequenceName = "CAR_SEQ", initialValue=1, allocationSize=1)
	private Long id;

	@NotNull
	@Column(name = "NAME")
	private String name;

	public Car() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [ID=" + getId() + ", name=" + getName() + "]";
	}
}