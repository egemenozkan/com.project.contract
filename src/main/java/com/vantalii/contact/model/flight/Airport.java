package com.vantalii.contact.model.flight;

import com.vantalii.contact.model.place.PlaceDto;

public class Airport extends PlaceDto {
	
	private String iata;
	private String icao;
	private String faa;
	private int dhmId;
	private boolean internationalFlights;

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getFaa() {
		return faa;
	}

	public void setFaa(String faa) {
		this.faa = faa;
	}

	public int getDhmId() {
		return dhmId;
	}

	public void setDhmId(int dhmId) {
		this.dhmId = dhmId;
	}


	public boolean isInternationalFlights() {
		return internationalFlights;
	}

	public void setInternationalFlights(boolean internationalFlights) {
		this.internationalFlights = internationalFlights;
	}

}
