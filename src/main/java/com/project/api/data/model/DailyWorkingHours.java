package com.project.api.data.model;

import java.io.Serializable;
import java.time.LocalTime;

public class DailyWorkingHours implements Serializable {

	private static final long serialVersionUID = 3487796821463770367L;

	private int day;
	private LocalTime begin;
	private LocalTime end;
	private boolean today;
	private boolean closed;

	public DailyWorkingHours() {
	}

	public DailyWorkingHours(int day, LocalTime begin, LocalTime end, boolean today, boolean closed) {
		this.day = day;
		this.begin = begin;
		this.end = end;
		this.today = today;
		this.closed = closed;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public LocalTime getBegin() {
		return begin;
	}

	public void setBegin(LocalTime begin) {
		this.begin = begin;
	}

	public LocalTime getEnd() {
		return end;
	}

	public void setEnd(LocalTime end) {
		this.end = end;
	}

	public boolean isToday() {
		return today;
	}

	public void setToday(boolean today) {
		this.today = today;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

}
