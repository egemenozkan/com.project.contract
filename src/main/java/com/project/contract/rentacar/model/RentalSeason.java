package com.project.contract.rentacar.model;

import java.io.Serializable;
import java.util.List;

public class RentalSeason implements Serializable {

	private static final long serialVersionUID = -2908206932442391309L;

	private String id;
	private String name;
	private List<RentalSeasonPeriod> periods;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<RentalSeasonPeriod> getPeriods() {
		return periods;
	}
	public void setPeriods(List<RentalSeasonPeriod> periods) {
		this.periods = periods;
	}
	
	

}
