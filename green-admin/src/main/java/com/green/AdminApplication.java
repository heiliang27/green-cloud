package com.green;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminApplication {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		new SpringApplicationBuilder(AdminApplication.class).web(true).run(args);
	}
}
