/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.firstspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author KSC
 * start
 */
@SpringBootApplication
@MapperScan("com.kingland.firstspringboot.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
