package online_banking.com.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("online_banking.com.services")
public class Config {

	@Bean
	public Address getObj() {
		return new Address();
	}
}
