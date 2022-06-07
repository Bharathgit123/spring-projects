package com.app;


import com.pojo.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.boot.autoconfigure.SpringBootApplication
        @ComponentScan(basePackages ={
        "com.controller", "com.pojo","com.service"})
@EntityScan(basePackages="com.pojo")
public class SpringBootApplication {


    public static void main(String args[]) {


        SpringApplication.run(SpringBootApplication.class);

    }


}
