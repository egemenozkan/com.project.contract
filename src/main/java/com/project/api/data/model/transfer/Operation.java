package com.project.api.data.model.transfer;

import java.io.Serializable;
import java.util.List;

import com.project.api.data.model.spatial.Route;

public class Operation implements Serializable {

	private static final long serialVersionUID = 6061966289832016026L;
	private int id;
	private List<Passenger> passengers;
	private List<Route> routes;

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

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

}
