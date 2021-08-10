package com.vantalii.contact.model.hotel;

import com.vantalii.contact.model.place.PlaceDto;
import com.vantalii.contract.enums.Star;

public class Hotel extends PlaceDto {
	private String formerName;
	private Star star;

	public String getFormerName() {
		return formerName;
	}

	public void setFormerName(String formerName) {
		this.formerName = formerName;
	}

	public Star getStar() {
		return star;
	}

	public void setStar(Star star) {
		this.star = star;
	}
}
