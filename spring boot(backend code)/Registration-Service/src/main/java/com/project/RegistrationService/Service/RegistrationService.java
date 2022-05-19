package com.project.RegistrationService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.RegistrationService.Entity.User;
import com.project.RegistrationService.Repository.UserRepository;

@Service
public class RegistrationService
{
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user)
	{
		return repository.save(user);
	}

	public ResponseEntity<?> checkValidUser(User userData)
	{
		User user=repository.findByUsername(userData.getUsername());
		if(user.getPassword().equals(userData.getPassword()))
		{
			return ResponseEntity.ok(user);
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();	
	}
}
