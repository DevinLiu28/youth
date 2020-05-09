package com.rebirth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rebirth.user.mapper")
public class YouthApplication {

    public static void main(String[] args) {
        SpringApplication.run(YouthApplication.class, args);
    }

}
