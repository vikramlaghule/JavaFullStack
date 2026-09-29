package com.upi.googlePay.Exception;

import java.time.LocalDateTime;

public class ErrorResponse {

	String message;
	String causedAt;
	LocalDateTime time;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCausedAt() {
		return causedAt;
	}
	public void setCausedAt(String causedAt) {
		this.causedAt = causedAt;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
}
