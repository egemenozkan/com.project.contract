package com.project.api.data.model.place;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.project.api.data.enums.Language;
import com.project.api.data.enums.PlaceType;
import com.project.api.data.model.common.Address;
import com.project.api.data.model.common.Contact;
import com.project.api.data.model.file.MyFile;

public class Place implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5779998595076999777L;
	private long id;
	private String name;
	private Language language;
	private String slug;

//	private List<Localisation>  localisation;
	private Map<String, Localisation> localisation;
	private PlaceType type;
	private Address address;
	private Contact contact;
	
	private LocalDateTime createDateTime;
	private LocalDateTime updateDateTime;
	
	private List<MyFile> images;
	private MyFile mainImage;


	public MyFile getMainImage() {
		return mainImage;
	}

	public void setMainImage(MyFile mainImage) {
		this.mainImage = mainImage;
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

//	public HashMap<String, Localisation> getLocalisation() {
//		return localisation;
//	}
//
//	public void setLocalisation(HashMap<String, Localisation> localisation) {
//		this.localisation = localisation;
//	}

}
