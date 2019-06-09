package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("email")
public class EmailService implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		
System.out.println("emailService");
	}

}
