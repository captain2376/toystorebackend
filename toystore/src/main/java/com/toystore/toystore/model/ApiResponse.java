package com.toystore.toystore.model;

public class ApiResponse {
	private Boolean success;
	private String message;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ApiResponse(Boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

}
