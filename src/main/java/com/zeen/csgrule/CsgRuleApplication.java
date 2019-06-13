package com.zeen.csgrule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.zeen.csgrule.dao"})
@SpringBootApplication
public class CsgRuleApplication {

    public static void main(String[] args) {

        SpringApplication.run(CsgRuleApplication.class, args);
    }

}
