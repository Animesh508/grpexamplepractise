package com.services.banking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.services.banking")
public class config {
	@Bean
	public Address getObj() {
		return new Address();
	}

}
