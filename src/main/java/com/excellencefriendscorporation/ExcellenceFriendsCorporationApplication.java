package com.excellencefriendscorporation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableAutoConfiguration
public class ExcellenceFriendsCorporationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExcellenceFriendsCorporationApplication.class, args);
	}

}
