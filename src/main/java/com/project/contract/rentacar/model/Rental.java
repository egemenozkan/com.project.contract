package com.project.contract.rentacar.model;

import java.io.Serializable;
import java.util.List;

public class Rental implements Serializable {

	private static final long serialVersionUID = 2179354205707870902L;

	private Vehicle vehicle;
	private List<RentalSeasonPeriodFee> seasonPeriodFees;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public List<RentalSeasonPeriodFee> getSeasonPeriodFees() {
		return seasonPeriodFees;
	}

	public void setSeasonPeriodFees(List<RentalSeasonPeriodFee> seasonPeriodFees) {
		this.seasonPeriodFees = seasonPeriodFees;
	}

}
