package com.lszt.eurcka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurckaServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurckaServerApplication.class, args);
	}
}
