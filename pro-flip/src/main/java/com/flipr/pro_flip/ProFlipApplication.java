package com.flipr.pro_flip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ProFlipApplication {

    public static void main(String[] args) {
        new File("uploads").mkdir();
        SpringApplication.run(BackendApplication.class, args);
    }
}
