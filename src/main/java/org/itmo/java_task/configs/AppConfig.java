package org.itmo.java_task.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.format.DateTimeFormatter;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public DateTimeFormatter formatter() { return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); }
}
