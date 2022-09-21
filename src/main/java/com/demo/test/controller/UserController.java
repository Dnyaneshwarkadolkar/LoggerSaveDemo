package com.demo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.test.model.User;
import com.demo.test.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
	private UserService userService;
@PostMapping("/save")
public ResponseEntity<User> saveUser(@RequestBody User user){
	User us=userService.saveUser(user);
	return ResponseEntity.ok().body(us);
}

}
