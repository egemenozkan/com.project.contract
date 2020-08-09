package com.project.contract.rentacar.model;

import java.io.Serializable;
import java.time.LocalDate;

public class RentalSeasonPeriod implements Serializable {

	private static final long serialVersionUID = -2908206932442391309L;

	private String id;
	private LocalDate beginDate;
	private LocalDate endDate;
	private int ordinal;

	public RentalSeasonPeriod(LocalDate beginDate, LocalDate endDate, int ordinal) {
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.ordinal = ordinal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

}
