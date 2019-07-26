package com.dashlines.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DashlinesGatewayApp {

	public static void main(String[] args) {
		SpringApplication.run(DashlinesGatewayApp.class, args);
	}

}