package c4a.kenefa.api.model.entity.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class Coordonates {

	private Double longitude;
	private Double latitude;

	/**
	 * @param longitude
	 * @param latitude
	 */
	public Coordonates(Double longitude, Double latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

}
