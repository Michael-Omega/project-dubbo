package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.project.mapper")
public class ProjectSecurityProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSecurityProviderApplication.class, args);
	}

}
