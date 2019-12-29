package com.sunny.ifil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunny.ifil.dao")
public class IfilApplication {

  public static void main(String[] args) {
    SpringApplication.run(IfilApplication.class, args);
  }

}
