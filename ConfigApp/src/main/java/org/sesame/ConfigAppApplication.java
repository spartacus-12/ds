package org.sesame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ConfigAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigAppApplication.class, args);
	}
}
