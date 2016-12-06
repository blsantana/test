package org.fiveware.test.web.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(
	basePackages = {
		"org.fiveware.test.model", 
		"org.fiveware.test.web"
	}
)
public class SpringWEBConfiguration {
	
	SpringWEBConfiguration() {

	}
}