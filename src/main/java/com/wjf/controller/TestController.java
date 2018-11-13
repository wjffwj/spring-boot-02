package com.wjf.controller;

import com.wjf.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    Person person;
    @RequestMapping(value = "test")
    public String sayHello(){
        return "Hello"+person.getLastName();
    }

}
