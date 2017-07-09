package com.altm.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/auth")
public class AuthController {

	/*
	 * rest endpoint which fetch and return the authentication token from request assuming
	 * JWT token
	 * */
	@RequestMapping(method=RequestMethod.GET)
	public String getToken(HttpServletRequest request){
		String token="";
		token=request.getHeader("X-Authorization");
		if(token!=null && token.trim().startsWith("Bearer")){
			token="Found Token : "+token.replace("Bearer","");
		}else{
			token="No Token found";
		}
		return token;
	}
}
