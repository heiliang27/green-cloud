package com.green;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.green"})
public class AdminApplication {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		new SpringApplicationBuilder(AdminApplication.class).web(true).run(args);
	}
}
