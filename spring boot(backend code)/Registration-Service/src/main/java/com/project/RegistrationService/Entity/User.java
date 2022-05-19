package com.project.RegistrationService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User 
{
	@Id
	@GeneratedValue
	private int userId;
	private String username;
    private int age;
    private String gender;
    private String hobbies;
    private String password;
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, int age, String gender, String hobbies, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.age = age;
		this.gender = gender;
		this.hobbies = hobbies;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
