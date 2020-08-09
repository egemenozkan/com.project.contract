package com.project.api.data.model.transfer;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.project.api.data.model.spatial.Route;
import com.project.api.data.model.transfer.enums.OperationStatus;
import com.project.api.data.model.vehicle.Vehicle;

public class Operation implements Serializable {

	private static final long serialVersionUID = 6061966289832016026L;
	private int id;
	private List<Passenger> passengers;
	private Route route;
	private Vehicle vehicle;
	private List<Driver> drivers;
	private OperationStatus status;
	private LocalDateTime pickUpDateTime;

	private OperationNotes operationNotes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	public OperationStatus getStatus() {
		return status;
	}

	public void setStatus(OperationStatus status) {
		this.status = status;
	}

	public OperationNotes getOperationNotes() {
		return operationNotes;
	}

	public void setOperationNotes(OperationNotes operationNotes) {
		this.operationNotes = operationNotes;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public LocalDateTime getPickUpDateTime() {
		return pickUpDateTime;
	}

	public void setPickUpDateTime(LocalDateTime pickUpDateTime) {
		this.pickUpDateTime = pickUpDateTime;
	}

}
