package com.gld.ncs;

import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gld.ncs.mapper")
public class NcsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NcsApplication.class, args);
    }

}
