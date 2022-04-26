package com.brightly.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "")
public class DockerDemoWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoWithMysqlApplication.class, args);
	}

}
