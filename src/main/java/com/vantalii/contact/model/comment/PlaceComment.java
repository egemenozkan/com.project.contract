package com.vantalii.contact.model.comment;

import com.vantalii.contact.model.place.PlaceDto;

public class PlaceComment extends Comment {

	private PlaceDto place;

	public PlaceDto getPlace() {
		return place;
	}

	public void setPlace(PlaceDto place) {
		this.place = place;
	}

}
