package com.ebig.som.tool.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class SomToolEurekaApplication {
	
    public static void main( String[] args ){
    	SpringApplication.run(SomToolEurekaApplication.class, args);
		log.info("=============SomToolEurekaApplication==============");
    }
}
