package com.let.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DatabaseConfig.class)
@ComponentScan(basePackages = "com.let")
public class ApplicationConfig {

	@Bean
	public Date getCurrentDate() {
		return new Date();
	}
}
