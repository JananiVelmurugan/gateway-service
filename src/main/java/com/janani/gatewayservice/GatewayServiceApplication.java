package com.janani.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.janani.gatewayservice.filters.AddRequestHeaderFilters;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	@Bean
	public AddRequestHeaderFilters add() {
		return new AddRequestHeaderFilters();
	}
}
