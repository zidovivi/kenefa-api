package c4a.kenefa.api.model.domain.embedded;

import c4a.kenefa.api.model.entity.embedded.Type;

public class Statistics {
	private Type type;
	private Long value;
	/**
	 * @param type
	 * @param value
	 */
	public Statistics(Type type, Long value) {
		super();
		this.type = type;
		this.value = value;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @return the value
	 */
	public Long getValue() {
		return value;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Long value) {
		this.value = value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Statistics [type=" + type + ", value=" + value + "]";
	}
	
	
}
