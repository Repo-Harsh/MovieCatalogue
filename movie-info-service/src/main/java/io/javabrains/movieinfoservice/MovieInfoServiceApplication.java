package io.javabrains.movieinfoservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoServiceApplication {
	
	@Bean
	@LoadBalanced
	@Qualifier("Eureka")
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	@Qualifier("normal")
	@Primary // If we dont specify primary here then bean has to access by either qulaifier or  name i.e restTemplate
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
