package com.project.api.data.model.comment;

import java.util.List;

public class PlaceCommentResponse {
	private long placeId;
	private List<Comment> comments;
	private boolean success;

	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public int getSize() {
		if (this.comments == null || this.comments.isEmpty()) {
			return 0;
		} else {
			return this.comments.size();
		}
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
