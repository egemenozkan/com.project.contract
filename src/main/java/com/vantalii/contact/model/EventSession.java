package com.vantalii.contact.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class EventSession implements Serializable {

	private static final long serialVersionUID = -5134422561862047129L;

	private int day;
	private LocalDate date;
	private LocalTime startTime;
	private LocalTime endTime;
	private boolean now;
	private boolean today;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public boolean isNow() {
		return now;
	}

	public void setNow(boolean now) {
		this.now = now;
	}

	public boolean isToday() {
		return today;
	}

	public void setToday(boolean today) {
		this.today = today;
	}

}
