package com.example.beyondredditeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BeyondRedditEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeyondRedditEurekaServerApplication.class, args);
    }

}
