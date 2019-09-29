package com.project.api.data.model.comment;

import java.util.List;

public class CommentResponse {
	private long id;
	private List<Comment> comments;
	private boolean success;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getSize() {
		if (this.comments == null || this.comments.isEmpty()) {
			return 0;
		} else {
			return this.comments.size();
		}
	}

}
