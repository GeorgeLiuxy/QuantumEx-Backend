package com.bizzan.bitrade;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableEurekaClient
public class MarketApplication {
    public static void main(String[] args){
        SpringApplication.run(MarketApplication.class,args);
    }
}
