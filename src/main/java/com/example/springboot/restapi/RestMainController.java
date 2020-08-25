package com.example.springboot.restapi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestMainController {
    
    @GetMapping("/rest1")
    public Map<String, Object> rest1(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data1", "data1");
        map.put("data2", "data2");
        return map;
    } 
    
}