package com.upi.googlePay.Exception;

import java.time.LocalDateTime;
import java.util.HashMap;

public class ErrorResponse2 {
	
	HashMap<String, String> mp;
	LocalDateTime time;
	public HashMap<String, String> getMp() {
		return mp;
	}
	public void setMp(HashMap<String, String> mp) {
		this.mp = mp;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public ErrorResponse2(HashMap<String, String> mp, LocalDateTime time) {
		super();
		this.mp = mp;
		this.time = time;
	}
	
}
