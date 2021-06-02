package com.ebay.ebayeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EbayEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbayEurekaServerApplication.class, args);
	}

}
