package com.vantalii.contact.model.spatial;

import java.io.Serializable;

public class Coordinate implements Serializable {

	private static final long serialVersionUID = 722910329232237518L;
	private double latitude;
	private double longitude;

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
