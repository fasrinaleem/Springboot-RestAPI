package com.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
	
	public static final Contact SUPPORTED_CONTACTS = new Contact("Fasrin Aleem", "http://www.fasrinaleem.com", "suppor@fasrinaleem.com");

	@Bean
    public Docket newApi(){
        Set produce= new HashSet<>(Arrays.asList("application/json","application/xml"));
        Set consume= new HashSet<>(Arrays.asList("application/json","application/xml"));
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .produces(produce)
                .consumes(consume);
    }

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee Service")
				.description("Employee service with Swagger Documentation")
				.termsOfServiceUrl("http://www.fasrinaleem.com")
				.contact(SUPPORTED_CONTACTS)
				.license("Employee Licence Info")
				.licenseUrl("http://www.fasrinaleem.com/license")
				.version("3.0")
				.build();
				
	}
}
