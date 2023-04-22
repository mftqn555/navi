package com.myweb.navi.user.dto;

import lombok.Getter;

@Getter
public class PasswordRequest {
	
	private String email;
	private String password;
	
	public PasswordRequest() {
	}

	public PasswordRequest(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
}
