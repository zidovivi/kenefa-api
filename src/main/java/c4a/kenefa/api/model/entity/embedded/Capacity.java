package c4a.kenefa.api.model.entity.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class Capacity {

	private int bed;
	private int doctor;
	private int nurse;

	public Capacity(int bed, int doctor, int nurse) {
		super();
		this.bed = bed;
		this.doctor = doctor;
		this.nurse = nurse;
	}

	public Capacity() {
		super();
	}

	public int getBed() {
		return bed;
	}

	public void setBed(int bed) {
		this.bed = bed;
	}

	public int getDoctor() {
		return doctor;
	}

	public void setDoctor(int doctor) {
		this.doctor = doctor;
	}

	public int getNurse() {
		return nurse;
	}

	public void setNurse(int nurse) {
		this.nurse = nurse;
	}
}
