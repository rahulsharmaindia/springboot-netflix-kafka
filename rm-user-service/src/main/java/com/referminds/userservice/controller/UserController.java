package com.referminds.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.referminds.userservice.entity.User;
import com.referminds.userservice.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	@Autowired
	UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/user")
	public ResponseEntity<Iterable<User>> getAll() {

		Iterable<User> all = userService.findAll();

		return new ResponseEntity<>(all, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/user")
	public ResponseEntity<User> register(@RequestBody User input) {

		User result = userService.registerUser(input);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
