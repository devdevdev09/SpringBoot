package com.example.springboot.argument;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import org.springframework.boot.SpringApplication;

@Service
public class Arguments {

    // @Value("${person.name}")
    // private String name;

    // @Value("${person.test:NULL}")
    // private String test;

    // public void getArgument(){
    //     System.out.println(" getArgument :: " + name);
    //     System.out.println(" getArgument :: test :: " + test);

    //     if("null".equals(test)){
    //         System.out.println("tetttttttt");
    //     }
    //     if(test.equals(null)){
    //         System.out.println("프로그램 종료");
    //         System.exit(1);
    //     }else{
    //         System.out.println("------");
    //     }
    // }

}