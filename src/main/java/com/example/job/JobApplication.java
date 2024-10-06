package com.example.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

@SpringBootApplication
@Slf4j
public class JobApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            final var random = new Random();

            final var randomNumber = random.nextInt(6) + 1; // Generates a random number between 1 and 6
            log.info("Generated number: {}", randomNumber);

            if (randomNumber == 6) {
                log.info("Success! 6 received, job completed");
                System.exit(0);
            } else {
                log.info("Application stopping as 6 was not received");
                System.exit(1);
            }


        };
    }
}
