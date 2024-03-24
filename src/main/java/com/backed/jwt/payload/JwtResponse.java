package com.backed.jwt.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtResponse {

	
	private String jwtToken;
    private String username;
	
    public void setToken(String jwtToken) {
	        this.jwtToken = jwtToken;
	    }
	
}
