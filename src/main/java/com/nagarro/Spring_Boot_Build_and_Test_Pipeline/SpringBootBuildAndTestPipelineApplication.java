package com.nagarro.Spring_Boot_Build_and_Test_Pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootBuildAndTestPipelineApplication {

	@GetMapping("/msg")
	public String getMessge(){
		return "demo app";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBuildAndTestPipelineApplication.class, args);
	}

}
