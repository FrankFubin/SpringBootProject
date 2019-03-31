package com.fb.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = {"com.fb.demo.mapper"})
@EnableScheduling//开启定时任务
public class DemoApplication {

    public static void main(String[] args) {
        //SpringApplication是SpringBoot框架的核心类
        //SpringMVC的核心类是：DispacherServlet
        //Spring的核心类是：ClassPathXmlApplicationContext
        //Mybatis的核心类是：SqlSession
        SpringApplication.run(DemoApplication.class, args);
    }

}
