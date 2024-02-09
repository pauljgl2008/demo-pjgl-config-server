package com.example.config.server.demopjglconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoPjglConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPjglConfigServerApplication.class, args);
	}

}
