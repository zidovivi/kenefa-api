package c4a.kenefa.api.model.entity.embedded;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;

@Embeddable
public class Region {

	private String id;
	private String name;
	private List<City> cities = new ArrayList<City>();
}
