package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/user/{uid}")
	public String getUser(@PathVariable("uid") String uid) throws UserNotFoundException {
		if(uid.contentEquals("0")) {
			throw new UserNotFoundException("INVALID USER ID");
		}
		return "User was found";
	}
}
