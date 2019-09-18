package com.yida.adeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AdEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdEurekaApplication.class, args);
    }

}
