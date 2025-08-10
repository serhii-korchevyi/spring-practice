package com.springpractice.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.springpractice.springpractice",
                "justfordemo"
        }
)
public class SpringpracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringpracticeApplication.class, args);
    }

}
