package com.lxj.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2   
public class SwaggerConfig {
	

	@Bean   
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.enable(true)
				.groupName("登陆")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.lxj"))
				.build();
	}
	

	private ApiInfo apiInfo() {

		Contact contact = new Contact("zxb", "/", "1538646076@qq.com");
		return new ApiInfo(
				"SWAGGER练习", 
				"lxj练习", 
				"1.0", 
				"urn:tos", 
				contact, 
				"Apache 2.0",
				"http://www.apache.org/licenses/LICENSE-2.0", 
				new ArrayList<VendorExtension>()
				);
	}
	
}
