package tn.esprit.microservices.tn.esprit.microservices;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class CandidateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidateApplication.class, args);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	}
	@Bean
		ApplicationRunner init(CandidatRepository repo)
		{
			return args -> {
				Stream.of("Mariem","Sarra","Mohamed").forEach(nom -> {repo.save(new Candidat(nom));
				});
				repo.findAll().forEach(System.out::println);

			};
		}


}
