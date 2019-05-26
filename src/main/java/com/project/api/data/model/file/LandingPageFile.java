package com.project.api.data.model.file;

import com.project.api.data.enums.LandingPageType;

public class LandingPageFile extends MyFile {
	private long pageId;
	private String pageTitle;
	private String pageUrl;
	private LandingPageType pageType;

	public long getPageId() {
		return pageId;
	}

	public void setPageId(long pageId) {
		this.pageId = pageId;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public LandingPageType getPageType() {
		return pageType;
	}

	public void setPageType(LandingPageType pageType) {
		this.pageType = pageType;
	}

}
