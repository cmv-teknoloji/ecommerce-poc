package com.cmv.technology.ecommerce.ui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EurekaRestTemplateConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
