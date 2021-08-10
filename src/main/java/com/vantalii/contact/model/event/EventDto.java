package com.vantalii.contact.model.event;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.birprojedaha.common.enums.Language;
import com.birprojedaha.common.helpers.LocalDateDeserializer;
import com.birprojedaha.common.helpers.LocalDateSerializer;
import com.birprojedaha.common.helpers.LocalTimeDeserializer;
import com.birprojedaha.common.helpers.LocalTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vantalii.contact.model.file.MyFile;
import com.vantalii.contact.model.place.Localisation;
import com.vantalii.contact.model.place.PlaceDto;
import com.vantalii.contract.enums.FeeType;
import com.vantalii.contract.enums.PeriodType;

public class EventDto implements Serializable {
	private static final long serialVersionUID = -5523632934285768952L;
	
	/** **/
	
	private long id;
	private String name;
	private String description;
	private EventType type;
	private Language language;
	private String slug;
	private Map<String, Localisation> localisation;
	private PlaceDto place;
		
	
	/* TimeTable Data */
	private boolean usePlaceTimeTable;
	private long timeTableId;
	private PeriodType periodType;
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
	private boolean showStartDate;
	private boolean showEndDate;
	private boolean showStartTime;
	private boolean showEndTime;
	private boolean twentyFourSeven;
	private EventStatus status;

	
	
	
	/* duration in minutes*/
	private int duration;
	
	private List<MyFile> images;

	private MyFile mainImage;
	
	private EventDto master;
	/* if event lasts all day. */
	private FeeType feeType;
	
	private String biletixId;
	
	public EventDto getMaster() {
		return master;
	}

	public void setMaster(EventDto master) {
		this.master = master;
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
		
		if (this.timeTableId > 0) {
			strBuilder.append("?tmid=").append(this.timeTableId);
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

	public PlaceDto getPlace() {
		return place;
	}

	public void setPlace(PlaceDto place) {
		this.place = place;
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

	public long getTimeTableId() {
		return timeTableId;
	}

	public void setTimeTableId(long timeTableId) {
		this.timeTableId = timeTableId;
	}

	public boolean isTwentyFourSeven() {
		return twentyFourSeven;
	}

	public void setTwentyFourSeven(boolean twentyFourSeven) {
		this.twentyFourSeven = twentyFourSeven;
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

	public EventStatus getStatus() {
		return status;
	}

	public void setStatus(EventStatus status) {
		this.status = status;
	}

	public String getBiletixId() {
		return biletixId;
	}

	public void setBiletixId(String biletixId) {
		this.biletixId = biletixId;
	}

	public boolean isUsePlaceTimeTable() {
		return usePlaceTimeTable;
	}

	public void setUsePlaceTimeTable(boolean usePlaceTimeTable) {
		this.usePlaceTimeTable = usePlaceTimeTable;
	}

}
