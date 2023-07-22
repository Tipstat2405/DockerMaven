package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerMavenSampleApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DockerMavenSampleApplication.class);
    }


	public static void main(String[] args) {
		SpringApplication.run(DockerMavenSampleApplication.class, args);
		System.out.print("Hi Rayudyu I am Solo learner Devops JKnajsdhnskajcnsdkjcnsdjkcnsdjkcnsdjkcnsdhcsdhjcsdhcknsdkhcnks");
	}

}
