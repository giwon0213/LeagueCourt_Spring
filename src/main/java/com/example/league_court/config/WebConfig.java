package com.example.league_court.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // 모든 도메인에서의 요청 허용
                .allowedHeaders("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH");
    }

    // @Value("${image.image-dir}")
    // private String ADD_RESOURCE_IMG_DIR;

    // @Value("${image.image-url}")
    // private String ADD_RESOURCE_IMG_URL;

    // @Override
    // public void addResourceHandlers(ResourceHandlerRegistry registry) {

    //     registry.addResourceHandler(ADD_RESOURCE_IMG_URL)
    //             .addResourceLocations(ADD_RESOURCE_IMG_DIR);
    // }

}
