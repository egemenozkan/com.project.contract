package com.vantalii.contact.model.transfer;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.vantalii.contact.model.spatial.Point;
import com.vantalii.contact.model.transfer.enums.TransferReservationStatus;

public class TransferReservation implements Serializable {

	private static final long serialVersionUID = -2117738866541207880L;

	private int id;
	private TransferReservationStatus status;
	private LocalDateTime creationDateTime;

	private int adultCount;
	private int childCount;

	/** up to 10 kg, 6 months */
	private int infantCarrierCount;
	/** 9–25 kg, 0–7 years */
	private int convertibleSeatCount;
	/** 22–36 kg, 6–12 years */
	private int boosterSeatCount;

	/** Golf equipment, Skis, Snowboard */
	private int sportLuggageCount;
	/**
	 * The below amount applies to luggage in the size of 55 cm (22”) x 45 cm (18”)
	 * x 25 cm (10”)
	 */
	private int luggageCount;

	/** Notes **/
	private String airline;
	private String flightNumber;
	private String voucher;
	private String noteForDriver;

	private Point pickUp;
	private Point destination;

	private LocalDateTime pickUpTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TransferReservationStatus getStatus() {
		return status;
	}

	public void setStatus(TransferReservationStatus status) {
		this.status = status;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public int getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public int getInfantCarrierCount() {
		return infantCarrierCount;
	}

	public void setInfantCarrierCount(int infantCarrierCount) {
		this.infantCarrierCount = infantCarrierCount;
	}

	public int getConvertibleSeatCount() {
		return convertibleSeatCount;
	}

	public void setConvertibleSeatCount(int convertibleSeatCount) {
		this.convertibleSeatCount = convertibleSeatCount;
	}

	public int getBoosterSeatCount() {
		return boosterSeatCount;
	}

	public void setBoosterSeatCount(int boosterSeatCount) {
		this.boosterSeatCount = boosterSeatCount;
	}

	public int getSportLuggageCount() {
		return sportLuggageCount;
	}

	public void setSportLuggageCount(int sportLuggageCount) {
		this.sportLuggageCount = sportLuggageCount;
	}

	public int getLuggageCount() {
		return luggageCount;
	}

	public void setLuggageCount(int luggageCount) {
		this.luggageCount = luggageCount;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public String getNoteForDriver() {
		return noteForDriver;
	}

	public void setNoteForDriver(String noteForDriver) {
		this.noteForDriver = noteForDriver;
	}

	public Point getPickUp() {
		return pickUp;
	}

	public void setPickUp(Point pickUp) {
		this.pickUp = pickUp;
	}

	public Point getDestination() {
		return destination;
	}

	public void setDestination(Point destination) {
		this.destination = destination;
	}

	public LocalDateTime getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(LocalDateTime pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

}
