package com.example.project.springsecurity;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.project.springsecurity.entity.Gender;
import com.example.project.springsecurity.entity.user;
import com.example.project.springsecurity.entity.userProfile;
import com.example.project.springsecurity.repository.UserProfileRepository;
import com.example.project.springsecurity.repository.UserRepository;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public void run(String... args) throws Exception{
		user user = new user();
		user.setName("Neeraja");
		user.setEmail("neeru@gmail.com");
		
		user user1 = new user();
		user1.setName("Mahi");
		user1.setEmail("mahi@gmail.com");
		
		userProfile userprofile = new userProfile();
		userprofile.setAddress("Banglore");
		userprofile.setBirthOfDate(LocalDate.of(1999, 10, 13));
		userprofile.setGender(Gender.FEMALE);
		userprofile.setPhoneNumber("6309469205");
		
		userProfile userprofile1 = new userProfile();
		userprofile1.setAddress("Nashik");
		userprofile1.setBirthOfDate(LocalDate.of(1999, 03, 16));
		userprofile1.setGender(Gender.MALE);
		userprofile1.setPhoneNumber("6309454235");
		
		
		user1.setUserProfile(userprofile1);
		userprofile1.setUser(user1);
		
		userRepository.save(user1);
	}

}
