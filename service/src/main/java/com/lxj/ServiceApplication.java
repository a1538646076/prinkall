package com.lxj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.lxj.bean","com.lxj.config","com.lxj.controller","com.lxj.mapper","com.lxj.service"})
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
