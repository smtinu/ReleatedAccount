package com.ReleatedAccounts.ReleatedAccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReleatedAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReleatedAccountsApplication.class, args);
	}
}
