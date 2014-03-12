package org.sonegy.clipboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: sonegy@sk.com
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
