package c4a.kenefa.api.model.entity.embedded;

import java.text.Normalizer;
import java.util.Set;
import java.util.regex.Pattern;

import javax.persistence.Embedded;

import org.datanucleus.util.StringUtils;

public class City {
	private String id;
	private String name;
	private String description;
	private String region;
	@Embedded
	private Coordonates location;
	/**
	 * @param id
	 * @param name
	 * @param countryId
	 * @param location
	 */
	public City(String id, String name, String countryId, Coordonates location) {
		super();
		generateId(countryId);
		this.name = name;
		this.location = location;
	}
	private void generateId(String countryId){
		String cleanName=deAccent(name);
	}
	public String deAccent(String str) {
	    String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
	    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	    return pattern.matcher(nfdNormalizedString).replaceAll("");
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
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @return the location
	 */
	public Coordonates getLocation() {
		return location;
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
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Coordonates location) {
		this.location = location;
	}
	
	
}
