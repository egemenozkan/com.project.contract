package com.project.api.data.model.event;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.project.api.data.enums.EventPeriodType;
import com.project.api.data.enums.EventType;
import com.project.api.data.enums.Language;
import com.project.api.data.model.file.MyFile;
import com.project.api.data.model.place.Localisation;
import com.project.api.data.model.place.Place;
import com.project.api.data.utils.LocalDateDeserializer;
import com.project.api.data.utils.LocalDateSerializer;
import com.project.api.data.utils.LocalTimeDeserializer;
import com.project.api.data.utils.LocalTimeSerializer;

public class Event {
	private long id;
	private String name;
	private String description;
	private EventType type;
	private Language language;
	private String slug;
	private Map<String, Localisation> localisation;
	private Place place;
	private EventPeriodType periodType;
	private int[] days;
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

	private List<MyFile> images;

	private MyFile mainImage;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Map<String, Localisation> getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Map<String, Localisation> localisation) {
		this.localisation = localisation;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public EventPeriodType getPeriodType() {
		return periodType;
	}

	public void setPeriodType(EventPeriodType periodType) {
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
	
	public List<MyFile> getImages() {
		return images;
	}

	public void setImages(List<MyFile> images) {
		this.images = images;
	}

	public MyFile getMainImage() {
		return mainImage;
	}

	public void setMainImage(MyFile mainImage) {
		this.mainImage = mainImage;
	}

	public int[] getDays() {
		return days;
	}

	public void setDays(int[] days) {
		this.days = days;
	}


}
