package com.ebig.som.tool.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringCloudApplication
public class SomToolGatewayApplication {
	
    public static void main( String[] args ){
    	SpringApplication.run(SomToolGatewayApplication.class, args);
		log.info("==============SomToolGatewayApplication===============");
    }
}
