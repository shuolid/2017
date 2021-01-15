package com.example.demo;

import com.jd.jsf.spring.boot.annotation.EnableJsf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@RestController
@EnableJsf
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

	public static void main(String[] args) {
//		System.setProperty("spring.config.additional-location", "classpath:./yaml/");
//		System.setProperty("spring.config.name", "jsf-consumer");
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
