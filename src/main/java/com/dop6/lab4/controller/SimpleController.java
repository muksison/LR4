package com.dop6.lab4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@RestController
public class SimpleController {

    @RequestMapping("/currentDateTime")
    public String getCurrentDateTime() {
        Date dt = new Date();
        long time = dt.getTime();
        Timestamp ts = new Timestamp(time);
        return "Current time : " + ts;
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(required = false, defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}
