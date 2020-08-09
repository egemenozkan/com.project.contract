package com.project.api.data.model.event;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.project.api.data.enums.FeeType;
import com.project.api.data.enums.PeriodType;
import com.project.api.data.model.file.MyFile;
import com.project.api.data.model.place.Localisation;
import com.project.api.data.model.place.Place;
import com.project.common.enums.Language;

public class Event2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5523632934285768952L;
	private long id;
	private String name;
	private String description;
	private EventType type;
	private Language language;
	private String slug;
	private Map<String, Localisation> localisation;
	private Place place;

	/* duration in minutes */
	private int duration;

	private List<MyFile> images;

	private MyFile mainImage;

	private Event2 master;
	/* if event lasts all day. */
	private boolean allDay;
	private FeeType feeType;
	private List<TimeTable> timeTable;

	public Event2 getMaster() {
		return master;
	}

	public void setMaster(Event2 master) {
		this.master = master;
	}

	public boolean isAllDay() {
		return allDay;
	}

	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}

	public String getUrl() {
		if (this.language == null || this.slug == null) {
			return "";
		}
		StringBuilder strBuilder = new StringBuilder("/");
		if (this.language == Language.RUSSIAN) {
			strBuilder.append("events/").append(this.slug);
		} else {
			strBuilder.append(this.language.getCode().toLowerCase()).append("/events/").append(this.slug);
		}

		return strBuilder.toString();
	}

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

	public FeeType getFeeType() {
		return feeType;
	}

	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<TimeTable> getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(List<TimeTable> timeTable) {
		this.timeTable = timeTable;
	}

	public PeriodType getPeriodType() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).getPeriodType();
		}
		return PeriodType.NOTSET;
	}
	
	public LocalDate getStartDate() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).getStartDate();
		}
		return null;
	}

	public LocalDate getEndDate() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).getEndDate();
		}
		return null;
	}


	public boolean isShowStartDate() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).isShowStartDate();
		}
		return false;
	}
	
	public boolean isShowEndDate() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).isShowEndDate();
		}
		return false;
	}
	
	public LocalTime getStartTime() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).getStartTime();
		}
		return null;
	}

	public LocalTime getEndTime() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).getEndTime();
		}
		return null;
	}
	
	public boolean isShowStartTime() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).isShowStartTime();
		}
		return false;
	}
	
	public boolean isShowEndTime() {
		if (!CollectionUtils.isEmpty(timeTable)) {
			return timeTable.get(0).isShowEndTime();
		}
		return false;
	}
	
	

}
