package com.ccstudent.gccclibroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GcccLibroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcccLibroServiceApplication.class, args);
    }

}
