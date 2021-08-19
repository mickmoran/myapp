package com.mickmproj.mickapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
public class Mick1 {

    @RequestMapping("/")
    public String index(){

        return "jamie";
    }
}
