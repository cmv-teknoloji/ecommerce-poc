package com.cmv.technology.ecommerce.ui.config;

import com.cmv.technology.ecommerce.ui.exceptions.CustomErrorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EurekaRestTemplateConfig {

    @Autowired
    private CustomErrorHandler customErrorHandler;

    @Bean
    RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(customErrorHandler);
        return restTemplate;
    }

}
