package c4a.kenefa.api.model.entity.embedded;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "facilityTypes")
public class FacilityType extends Type{	

	public FacilityType(String value) {
		super();
		this.name = value;
	}
	
	@Override
	public String toString() {
		return "FacilityType [id=" + id + ", type=" + name + "]";
	}

}
