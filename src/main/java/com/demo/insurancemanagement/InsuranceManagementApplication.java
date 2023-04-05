package com.demo.insurancemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.demo.insurancemanagement.Domain")
public class InsuranceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceManagementApplication.class, args);
	}

}
