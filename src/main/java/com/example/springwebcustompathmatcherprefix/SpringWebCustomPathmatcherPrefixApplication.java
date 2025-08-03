package com.example.springwebcustompathmatcherprefix;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWebCustomPathmatcherPrefixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebCustomPathmatcherPrefixApplication.class, args);
    }
    @Bean
    public ApplicationRunner applicationRunner(TestClient testClient) {
        return args -> {
            testClient.test1();
        };}
}
