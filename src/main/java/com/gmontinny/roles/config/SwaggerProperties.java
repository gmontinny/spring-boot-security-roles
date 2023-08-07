package com.gmontinny.roles.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "swagger")
public record SwaggerProperties(
        String projectTitle,
        String projectDescription,
        String projectVersion) {
}
