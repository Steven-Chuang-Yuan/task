/**
 * Copyright 2020 Kingland Systems Corporation.All Right Reserved
 */
package com.kingland.springsecurity;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KSC
 *
 */
@SpringBootApplication
@MapperScan("com.kingland.springsecurity.mapper.UserMapper")
public class SecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}
}
