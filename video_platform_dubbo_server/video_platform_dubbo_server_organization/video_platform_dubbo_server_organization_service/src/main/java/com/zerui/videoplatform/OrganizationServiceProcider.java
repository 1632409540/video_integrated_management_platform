package com.zerui.videoplatform;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication()
@EnableDubbo
public class OrganizationServiceProcider {
    public static void main(String[] args) {
        //SpringApplication.run(OrganizationServiceProcider.class, args);
        new SpringApplicationBuilder(OrganizationServiceProcider.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
