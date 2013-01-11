package c4a.kenefa.api.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import c4a.kenefa.api.model.entity.embedded.Capacity;
import c4a.kenefa.api.model.entity.embedded.Coordonates;
import c4a.kenefa.api.model.entity.embedded.FacilityType;
import c4a.kenefa.api.model.entity.embedded.Rating;
import c4a.kenefa.api.model.entity.embedded.Scope;
import c4a.kenefa.api.model.entity.embedded.Service;

@Entity
@Table(name = "facilities")
public class Facility {

	@Id
	@Column(name = "_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private String address;
	private String phone;
	@Enumerated(EnumType.STRING)
	private Scope scope;
	private String city;
	private String region;
	private String country;
	private String url;
	private String openingHours;
	@Embedded
	private Coordonates coordonates;
	@OneToOne
	private FacilityType type; // (physician, clinic, hospital, nursing home)
	private Date creationDate;

	List<Service> services = new ArrayList<Service>();
	@Embedded
	Capacity capacity;
	@Embedded
	Rating rating;

}
