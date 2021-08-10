package com.vantalii.contact.model;

import com.vantalii.contract.enums.ContactFormType;
import com.vantalii.contract.enums.LandingPageType;

public class ContactForm {
	private long id;
	private String title;
	private String text;
	private boolean read;
	private boolean sent;
	private ContactFormType type;
	private LandingPageType pageType;
	private int selfId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public boolean isSent() {
		return sent;
	}

	public void setSent(boolean sent) {
		this.sent = sent;
	}

	public ContactFormType getType() {
		return type;
	}

	public void setType(ContactFormType type) {
		this.type = type;
	}

	public LandingPageType getPageType() {
		return pageType;
	}

	public void setPageType(LandingPageType pageType) {
		this.pageType = pageType;
	}

	public int getSelfId() {
		return selfId;
	}

	public void setSelfId(int selfId) {
		this.selfId = selfId;
	}

}
