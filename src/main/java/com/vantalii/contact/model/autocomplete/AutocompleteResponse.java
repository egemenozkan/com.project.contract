package com.vantalii.contact.model.autocomplete;

import java.io.Serializable;
import java.util.List;

public class AutocompleteResponse implements Serializable {

	private static final long serialVersionUID = 8798960293186303006L;
	private boolean success;
	private String errorCode;
	private String errorMessage;
	private List<Item> items;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
