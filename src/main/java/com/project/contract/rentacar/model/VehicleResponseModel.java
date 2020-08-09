package com.project.contract.rentacar.model;

import java.io.Serializable;
import java.util.List;

import com.project.common.model.BaseResponseModel;

public class VehicleResponseModel extends BaseResponseModel implements Serializable {

	private static final long serialVersionUID = -5811388497066045407L;

	private List<Vehicle> vehicles;
	private Vehicle vehicle;

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
