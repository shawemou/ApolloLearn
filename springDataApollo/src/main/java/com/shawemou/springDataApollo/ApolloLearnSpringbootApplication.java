package com.shawemou.springDataApollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 *
 */
@SpringBootApplication
@ServletComponentScan
public class ApolloLearnSpringbootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApolloLearnSpringbootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApolloLearnSpringbootApplication.class, args);
    }

}
