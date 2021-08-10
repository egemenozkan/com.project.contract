package com.vantalii.contact.model.spatial;

import java.io.Serializable;

import com.vantalii.contact.model.common.IdValue;

/* 
 * @param Pointo */

public class Point implements Serializable {

	private static final long serialVersionUID = -4942246569246839318L;

	private long id;
	private String name;
	private Coordinate coordinate;
	private IdValue pointCategory;
	private long placeId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public IdValue getPointCategory() {
		return pointCategory;
	}

	public void setPointCategory(IdValue pointCategory) {
		this.pointCategory = pointCategory;
	}

	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

}