package com.example.springboot.common;

import com.example.springboot.argument.Arguments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/")
@RestController
public class CommonController {
    
    @Autowired
    Arguments arg;

    @RequestMapping(value = "/argument")
    public void argument(){
        // arg.getArgument();
    }

}