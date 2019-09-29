package com.project.api.data.model.event;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.project.api.data.enums.Language;
import com.project.api.data.model.place.Place;

public class EventSimple implements Serializable {
	
	private static final long serialVersionUID = 2180740616700857026L;
	
	private long id;
	private String name;
	private Language language;
	private EventType type;
	private LocalDate date;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Place place;
	private String url;
	private String imageUrl;
	private int attendee;
	private int like;

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

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getAttendee() {
		return attendee;
	}

	public void setAttendee(int attendee) {
		this.attendee = attendee;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

}
