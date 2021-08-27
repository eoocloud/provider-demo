package com.shendu.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShenduProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShenduProviderDemoApplication.class, args);
	}

}
