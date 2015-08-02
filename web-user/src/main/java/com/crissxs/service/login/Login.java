package com.crissxs.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crissxs.service.domain.User;
import com.crissxs.service.repository.graph.UserRepository;

@RestController
public class Login {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User login(@RequestBody User user) {
		User newUser = userRepository.findBySchemaPropertyValue("username",user.getUsername());
		if (newUser == null) {
			throw new IllegalStateException("User does not exist: " + user.getUsername());
		}
		return newUser;

	}

}
