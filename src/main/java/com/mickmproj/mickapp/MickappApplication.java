package com.mickmproj.mickapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class MickappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MickappApplication.class, args);
        //Config config = new Config();
        //System.out.println(config.getTester());
        //config.nothing();

    }


}
