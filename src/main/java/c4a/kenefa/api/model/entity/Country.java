package c4a.kenefa.api.model.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import c4a.kenefa.api.model.entity.embedded.City;
import c4a.kenefa.api.model.entity.embedded.Coordonates;
import c4a.kenefa.api.model.entity.embedded.Region;

@Entity
@Table(name = "countries")
public class Country {
	@Id
	@Column(name = "_id")
	private String id;
	private String name;
	private String description;
	private Coordonates coordonates;
	@Embedded
	private Collection<City> cities;

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param coordonates
	 */
	public Country(String id, String name, String description,
			Coordonates coordonates) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.coordonates = coordonates;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the coordonates
	 */
	public Coordonates getCoordonates() {
		return coordonates;
	}	

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param coordonates
	 *            the coordonates to set
	 */
	public void setCoordonates(Coordonates coordonates) {
		this.coordonates = coordonates;
	}	

}
