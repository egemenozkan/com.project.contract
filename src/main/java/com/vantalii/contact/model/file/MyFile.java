package com.vantalii.contact.model.file;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.security.core.userdetails.User;

import com.birprojedaha.common.helpers.LocalDateTimeDeserializer;
import com.birprojedaha.common.helpers.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vantalii.contract.enums.Status;

public class MyFile implements Serializable {

	private static final long serialVersionUID = -3173123704696760310L;
	private static final String IMAGE_SERVER_URL = "https://files.vantalii.com";
	private long id;
	private String uploadDir;
	private String name;
	private String extension;

	private User user;
	private Status status;
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime createDateTime;
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime updateDateTime;

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getLgUrl() {
		return IMAGE_SERVER_URL + this.uploadDir + "/" + this.name + "_lg" + "." + this.extension;
	}
	public String getMdUrl() {
		return IMAGE_SERVER_URL + this.uploadDir + "/" + this.name + "_md" + "." + this.extension;
	}
	public String getSmUrl() {
		return IMAGE_SERVER_URL+ this.uploadDir + "/" + this.name + "_sm" +"." + this.extension;
	}
	
	public String getXsUrl() {
		return IMAGE_SERVER_URL + this.uploadDir + "/" + this.name + "_xs" + "." + this.extension;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
