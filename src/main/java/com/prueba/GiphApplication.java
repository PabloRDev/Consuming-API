package com.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GiphApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiphApplication.class, args);
	}

}
