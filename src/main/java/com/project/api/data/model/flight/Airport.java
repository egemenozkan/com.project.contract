package com.project.api.data.model.flight;

import com.project.api.data.model.common.Location;
import com.project.api.data.model.place.Place;

public class Airport extends Place {
	
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
