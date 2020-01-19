package com.ebig.som.tool.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableConfigServer
@SpringCloudApplication
public class SomToolConfigApplication {
	
    public static void main( String[] args ){
    	SpringApplication.run(SomToolConfigApplication.class, args);
		log.info("=================SomToolConfigApplication=================");
    }
}
