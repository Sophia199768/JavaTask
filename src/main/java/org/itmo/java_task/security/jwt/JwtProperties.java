package org.itmo.java_task.security.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("security.jwt")
public class JwtProperties {
    private String secretKey;
}
