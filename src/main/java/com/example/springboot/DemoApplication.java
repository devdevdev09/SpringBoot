package com.example.springboot;

import com.example.springboot.argument.Arguments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{
// public class DemoApplication implements ApplicationRunner{
	
	@Autowired
	Arguments arg;

	public static void main(String[] args) {
		for (String string : args) {
			System.out.println("main args : " + string);
		}

		SpringApplication.run(DemoApplication.class, args);
	}

	// @Override
	// public void run(ApplicationArguments args) throws Exception {
	// 	// System.out.println("Run :: " + args);
	// 	System.out.println("Run :: name :: " + name);
	// }

}
