package com.bizzan.bitrade;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableEurekaClient
public class ExchangeApplication {
    public static void main(String[] args){
        SpringApplication.run(ExchangeApplication.class,args);
    }
}
