package com.cathay.config.server;


import com.cathay.springboot.starter.mybatis.EnableCathayMybatis;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCathayMybatis
@MapperScan(basePackages = "com.cathay")
@ComponentScan(value = {"com.cathay"})
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }


}
