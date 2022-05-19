package com.project.RegistrationService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.RegistrationService.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}