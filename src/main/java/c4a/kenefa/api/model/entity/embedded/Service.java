package c4a.kenefa.api.model.entity.embedded;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Service {
	@OneToOne
	private ServiceType type;
	private String infos;

}
