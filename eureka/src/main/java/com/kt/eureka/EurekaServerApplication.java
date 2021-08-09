package com.kt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <pre>
 * kt.com.cloud
 *    |_ EurekaServerApplication.java
 *
 * </pre>
 *
 * @author : mih
 * @Date : 2021/04/05
 * @프로그램 설명   :
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}