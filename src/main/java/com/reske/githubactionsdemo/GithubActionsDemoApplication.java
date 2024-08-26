package com.reske.githubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GithubActionsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsDemoApplication.class, args);
    }

    @RestController
    public static class HelloController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello World";
        }

    }

}
