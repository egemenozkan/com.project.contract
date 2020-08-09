package com.project.api.data.model.vehicle;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.project.api.data.model.common.IdValue;

public class Vehicle implements Serializable {
	
	private static final long serialVersionUID = 4744120892635871942L;
	
	private long id;
	private String currentPlate;
	private String frontNumber; // Or glass number
	private IdValue brand;
	private IdValue serial;
	private IdValue model;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate firstRegistrationDate; // trafiğe çıkış tarihi
	private IdValue color;
	private int maxPassengerLimit;
	private Boolean hasAssistantSeat;
	private VehicleType type;
	private boolean vip;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurrentPlate() {
		return currentPlate;
	}

	public void setCurrentPlate(String currentPlate) {
		this.currentPlate = currentPlate;
	}

	public String getFrontNumber() {
		return frontNumber;
	}

	public void setFrontNumber(String frontNumber) {
		this.frontNumber = frontNumber;
	}

	public IdValue getBrand() {
		return brand;
	}

	public void setBrand(IdValue brand) {
		this.brand = brand;
	}

	public IdValue getSerial() {
		return serial;
	}

	public void setSerial(IdValue serial) {
		this.serial = serial;
	}

	public IdValue getModel() {
		return model;
	}

	public void setModel(IdValue model) {
		this.model = model;
	}

	public LocalDate getFirstRegistrationDate() {
		return firstRegistrationDate;
	}

	public void setFirstRegistrationDate(LocalDate firstRegistrationDate) {
		this.firstRegistrationDate = firstRegistrationDate;
	}

	public IdValue getColor() {
		return color;
	}

	public void setColor(IdValue color) {
		this.color = color;
	}

	public int getMaxPassengerLimit() {
		return maxPassengerLimit;
	}

	public void setMaxPassengerLimit(int maxPassengerLimit) {
		this.maxPassengerLimit = maxPassengerLimit;
	}

	public Boolean getHasAssistantSeat() {
		return hasAssistantSeat;
	}

	public void setHasAssistantSeat(Boolean hasAssistantSeat) {
		this.hasAssistantSeat = hasAssistantSeat;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	
}
