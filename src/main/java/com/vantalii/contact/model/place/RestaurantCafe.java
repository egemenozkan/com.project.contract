package com.vantalii.contact.model.place;

import com.vantalii.contact.model.common.Network;

public class RestaurantCafe extends PlaceDto {
	private String formerName;
	private Network network;

	public String getFormerName() {
		return formerName;
	}

	public void setFormerName(String formerName) {
		this.formerName = formerName;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

}
