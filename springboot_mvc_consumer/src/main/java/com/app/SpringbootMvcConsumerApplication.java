package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootMvcConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcConsumerApplication.class, args);
	}

}
