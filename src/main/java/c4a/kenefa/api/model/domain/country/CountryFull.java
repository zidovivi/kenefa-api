package c4a.kenefa.api.model.domain.country;

import java.util.List;

import c4a.kenefa.api.model.domain.city.CityLight;
import c4a.kenefa.api.model.domain.embedded.Statistics;
import c4a.kenefa.api.model.domain.facility.FacilityLight;
import c4a.kenefa.api.model.entity.embedded.Coordonates;

public class CountryFull {
	private String id;
	private String name;
	private String description;
	private Coordonates location;
	private List<Statistics> statistics;
	private List<FacilityLight> topFacilities;
	private List<CityLight> cities;

	public CountryFull(){
		
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param location
	 * @param statistics
	 * @param topFacilities
	 * @param cities
	 */
	public CountryFull(String id, String name, String description,
			Coordonates location, List<Statistics> statistics,
			List<FacilityLight> topFacilities, List<CityLight> cities) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
		this.statistics = statistics;
		this.topFacilities = topFacilities;
		this.cities = cities;
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
	 * @return the location
	 */
	public Coordonates getLocation() {
		return location;
	}

	/**
	 * @return the statistics
	 */
	public List<Statistics> getStatistics() {
		return statistics;
	}

	/**
	 * @return the topFacilities
	 */
	public List<FacilityLight> getTopFacilities() {
		return topFacilities;
	}

	/**
	 * @return the cities
	 */
	public List<CityLight> getCities() {
		return cities;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Coordonates location) {
		this.location = location;
	}

	/**
	 * @param statistics the statistics to set
	 */
	public void setStatistics(List<Statistics> statistics) {
		this.statistics = statistics;
	}

	/**
	 * @param topFacilities the topFacilities to set
	 */
	public void setTopFacilities(List<FacilityLight> topFacilities) {
		this.topFacilities = topFacilities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<CityLight> cities) {
		this.cities = cities;
	}
	
	
}
