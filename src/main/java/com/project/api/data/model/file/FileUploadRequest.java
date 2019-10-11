package com.project.api.data.model.file;

import java.io.File;

import com.project.api.data.enums.FileType;
import com.project.api.data.enums.LandingPageType;

public class FileUploadRequest {
	
	
	private File file;
	private String name;
	private FileType type;
//	private MyFile file;
	private LandingPageType pageType;
	private long uId;
	private long userId;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FileType getType() {
		return type;
	}

	public void setType(FileType type) {
		this.type = type;
	}

	public LandingPageType getPageType() {
		return pageType;
	}

	public void setPageType(LandingPageType pageType) {
		this.pageType = pageType;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
