package com.project.api.data.model.place;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.project.api.data.enums.Language;
import com.project.api.data.enums.PeriodType;
import com.project.api.data.enums.PlaceType;
import com.project.api.data.model.Facility;
import com.project.api.data.model.common.Address;
import com.project.api.data.model.common.Contact;
import com.project.api.data.model.file.MyFile;
import com.project.api.data.utils.LocalTimeDeserializer;
import com.project.api.data.utils.LocalTimeSerializer;

public class Place implements Serializable {

	private static final long serialVersionUID = 6842340327834852081L;
	
	private long id;
	private String name;
	private Language language;
	private String slug;

	private Map<String, Localisation> localisation;

	private PlaceType type;
	private Address address;
	private Contact contact;

	private LocalDateTime createDateTime;
	private LocalDateTime updateDateTime;

	private List<MyFile> images;
	private MyFile mainImage;
	
	private List<Facility> facilities;

	private long timeTableId;

	public long getTimeTableId() {
		return timeTableId;
	}

	public void setTimeTableId(long timeTableId) {
		this.timeTableId = timeTableId;
	}

	public PeriodType getPeriodType() {
		return periodType;
	}

	public void setPeriodType(PeriodType periodType) {
		this.periodType = periodType;
	}

	public int[] getDays() {
		return days;
	}

	public void setDays(int[] days) {
		this.days = days;
	}

	public boolean isTwentyFourSeven() {
		return twentyFourSeven;
	}

	public void setTwentyFourSeven(boolean twentyFourSeven) {
		this.twentyFourSeven = twentyFourSeven;
	}

	public void setId(long id) {
		this.id = id;
	}

	private PeriodType periodType;
	private int[] days;
//	@JsonDeserialize(using = LocalDateDeserializer.class)
//	@JsonSerialize(using = LocalDateSerializer.class)
//	@DateTimeFormat(pattern = "dd.MM.yyyy")
//	private LocalDate startDate;
//	@JsonDeserialize(using = LocalTimeDeserializer.class)
//	@JsonSerialize(using = LocalTimeSerializer.class)
//	@DateTimeFormat(pattern = "HH:mm")
//	private LocalTime startTime;
//	@JsonDeserialize(using = LocalDateDeserializer.class)
//	@JsonSerialize(using = LocalDateSerializer.class)
//	@DateTimeFormat(pattern = "dd.MM.yyyy")
//	private LocalDate endDate;
//	@JsonDeserialize(using = LocalTimeDeserializer.class)
//	@JsonSerialize(using = LocalTimeSerializer.class)
//	@DateTimeFormat(pattern = "HH:mm")
//	private LocalTime endTime;
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	@JsonSerialize(using = LocalTimeSerializer.class)
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime openingTime;
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	@JsonSerialize(using = LocalTimeSerializer.class)
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime closingTime;

	private boolean twentyFourSeven;

	public Place(long id) {
		this.id = id;
	}

	public Place() {
	}

	public String getUrl() {
		if (this.language == null) {
			return "";
		}
		StringBuilder strBuilder = new StringBuilder("/");
		if (this.language == Language.RUSSIAN) {
			strBuilder.append("places/").append(this.slug);
		} else {
			strBuilder.append(this.language.getCode().toLowerCase()).append("/places/").append(this.slug);
		}

		return strBuilder.toString();
	}

	public MyFile getMainImage() {
		return mainImage;
	}

	public void setMainImage(MyFile mainImage) {
		this.mainImage = mainImage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public PlaceType getType() {
		return type;
	}

	public void setType(PlaceType type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<MyFile> getImages() {
		return images;
	}

	public void setImages(List<MyFile> images) {
		this.images = images;
	}

	public boolean isOpen() {
		if (this.openingTime != null && this.closingTime != null) {
			return (LocalTime.now().compareTo(this.openingTime) >= 0
					&& LocalTime.now().compareTo(this.closingTime) <= 0);
		}
		return this.isTwentyFourSeven();
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	public List<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}

}
