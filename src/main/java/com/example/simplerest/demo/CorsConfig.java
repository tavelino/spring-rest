package com.example.simplerest.demo;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("https://react-rest-simple-rest.apps.gjd7si6t.eastus.aroapp.io")
            .allowedMethods("GET", "POST", "PUT", "DELETE","PATCH")
            .allowedHeaders("*");
    }
}
