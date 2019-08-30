package com.llj.gate.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * Demo class
 *
 * @author llj
 * @date 2019/8/28
 */
@SpringBootApplication
public class GateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateApplication.class,args);
    }

//        @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route", r -> r.path("/student", "/student/*").uri("http://localhost:8090/student"))
//                .build();
//    }
}
