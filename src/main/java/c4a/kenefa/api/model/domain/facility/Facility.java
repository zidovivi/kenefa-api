package c4a.kenefa.api.model.domain.facility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import c4a.kenefa.api.model.domain.city.CityLight;
import c4a.kenefa.api.model.domain.country.CountryLight;
import c4a.kenefa.api.model.entity.embedded.Capacity;
import c4a.kenefa.api.model.entity.embedded.FacilityType;
import c4a.kenefa.api.model.entity.embedded.Rating;
import c4a.kenefa.api.model.entity.embedded.Scope;
import c4a.kenefa.api.model.entity.embedded.Service;

public class Facility {

	private String id;
	private String name;
	private FacilityType type;
	private String address;
	private String phone;
	private Scope scope;
	private CityLight city;
	private String region;
	private CountryLight country;
	private String url;
	private String openingHours;
	private Date creationDate;
	private List<Service> services = new ArrayList<Service>();
	private Capacity capacity;
	private Rating rating;
	
	public Facility(){
		
	}

	/**
	 * @param id
	 * @param name
	 * @param type
	 * @param address
	 * @param phone
	 * @param scope
	 * @param city
	 * @param region
	 * @param country
	 * @param url
	 * @param openingHours
	 * @param creationDate
	 * @param services
	 * @param capacity
	 * @param rating
	 */
	public Facility(String id, String name, FacilityType type, String address,
			String phone, Scope scope, CityLight city, String region,
			CountryLight country, String url, String openingHours,
			Date creationDate, List<Service> services, Capacity capacity,
			Rating rating) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.address = address;
		this.phone = phone;
		this.scope = scope;
		this.city = city;
		this.region = region;
		this.country = country;
		this.url = url;
		this.openingHours = openingHours;
		this.creationDate = creationDate;
		this.services = services;
		this.capacity = capacity;
		this.rating = rating;
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
	 * @return the type
	 */
	public FacilityType getType() {
		return type;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the scope
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * @return the city
	 */
	public CityLight getCity() {
		return city;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @return the country
	 */
	public CountryLight getCountry() {
		return country;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the openingHours
	 */
	public String getOpeningHours() {
		return openingHours;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @return the services
	 */
	public List<Service> getServices() {
		return services;
	}

	/**
	 * @return the capacity
	 */
	public Capacity getCapacity() {
		return capacity;
	}

	/**
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
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
	 * @param type the type to set
	 */
	public void setType(FacilityType type) {
		this.type = type;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(Scope scope) {
		this.scope = scope;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(CityLight city) {
		this.city = city;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(CountryLight country) {
		this.country = country;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param openingHours the openingHours to set
	 */
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @param services the services to set
	 */
	public void setServices(List<Service> services) {
		this.services = services;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	
}
