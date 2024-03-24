package com.backed.jwt.payload;

import lombok.Data;

@Data
public class JwtRequest {

	private String email;
	
	private String password;
}
