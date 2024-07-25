package edu.hit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.hit.mapper")
public class DheeProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(DheeProgramApplication.class, args);
    }

}
