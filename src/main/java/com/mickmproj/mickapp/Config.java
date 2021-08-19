package com.mickmproj.mickapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class Config {

    @Value("${logging.file.path}")
    public Resource tester;


//    public String getTester() {
//        return tester;
//    }


    @Bean
    public void nothing(){
        System.out.println("balls");

        System.out.println(tester.toString());
    }
}
