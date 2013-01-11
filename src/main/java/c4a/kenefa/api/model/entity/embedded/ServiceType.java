package c4a.kenefa.api.model.entity.embedded;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "serviceType")
public class ServiceType extends Type{

	public ServiceType(String value) {
		super();
		this.name = value;
	}

	

	@Override
	public String toString() {
		return "ServiceType [id=" + id + ", type=" + name + "]";
	}

}
