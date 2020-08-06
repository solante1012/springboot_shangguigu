package com.guigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guigu.springboot")
public class SpringBoot06DataMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBoot06DataMybatisApplication.class, args);
  }

}
