package com.backed.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonWebTokenBaseAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonWebTokenBaseAuthorizationApplication.class, args);
	}
//	curl -X POST \
//	  http://localhost:8080/auth/login \
//	  -H 'Content-Type: application/json' \
//	  -d '{
//		"email": "PANKAJ",
//		"password": "PANKAJ"
//	}'

}
