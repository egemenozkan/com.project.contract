package com.project.api.data.model.comment;

import com.project.api.data.model.place.Place;

public class PlaceComment extends Comment {

	private Place place;

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

}
