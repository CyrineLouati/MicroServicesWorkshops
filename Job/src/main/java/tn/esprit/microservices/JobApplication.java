package tn.esprit.microservices;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class JobApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobApplication.class, args);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

	}
	
	@Bean
		ApplicationRunner init(JobRepository repo)
		{
			return args -> {
				Stream.of("Service","Serviceeeee").forEach(service -> {repo.save(new Job(service));
				});
				repo.findAll().forEach(System.out::println);
	
			};
		}
	
}
