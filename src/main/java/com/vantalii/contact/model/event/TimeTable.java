package com.vantalii.contact.model.event;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.birprojedaha.common.helpers.LocalDateDeserializer;
import com.birprojedaha.common.helpers.LocalDateSerializer;
import com.birprojedaha.common.helpers.LocalTimeDeserializer;
import com.birprojedaha.common.helpers.LocalTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vantalii.contract.enums.LandingPageType;
import com.vantalii.contract.enums.PeriodType;

public class TimeTable implements Serializable {

	private static final long serialVersionUID = -7297405920678433296L;
	/** **/

	private long id;
	private long pageId;
	private LandingPageType pageType;
	private PeriodType periodType;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate startDate;
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	@JsonSerialize(using = LocalTimeSerializer.class)
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime startTime;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate endDate;
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	@JsonSerialize(using = LocalTimeSerializer.class)
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime endTime;
	private boolean showStartTime;
	private boolean showEndTime;
	private boolean showStartDate;
	private boolean showEndDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPageId() {
		return pageId;
	}

	public void setPageId(long pageId) {
		this.pageId = pageId;
	}

	public LandingPageType getPageType() {
		return pageType;
	}

	public void setPageType(LandingPageType pageType) {
		this.pageType = pageType;
	}

	public PeriodType getPeriodType() {
		return periodType;
	}

	public void setPeriodType(PeriodType periodType) {
		this.periodType = periodType;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public boolean isShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(boolean showStartTime) {
		this.showStartTime = showStartTime;
	}

	public boolean isShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(boolean showEndTime) {
		this.showEndTime = showEndTime;
	}

	public boolean isShowStartDate() {
		return showStartDate;
	}

	public void setShowStartDate(boolean showStartDate) {
		this.showStartDate = showStartDate;
	}

	public boolean isShowEndDate() {
		return showEndDate;
	}

	public void setShowEndDate(boolean showEndDate) {
		this.showEndDate = showEndDate;
	}

}
