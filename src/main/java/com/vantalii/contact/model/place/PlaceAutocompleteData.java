package com.vantalii.contact.model.place;

import org.locationtech.spatial4j.shape.Point;

import com.vantalii.contact.model.AutocompleteData;

public class PlaceAutocompleteData extends AutocompleteData {
    private String fbPlaceId;
    private Point coordinate;

    public String getFbPlaceId() {
	return fbPlaceId;
    }

    public void setFbPlaceId(String fbPlaceId) {
	this.fbPlaceId = fbPlaceId;
    }

    public Point getCoordinate() {
	return coordinate;
    }

    public void setCoordinate(Point coordinate) {
	this.coordinate = coordinate;
    }

}
