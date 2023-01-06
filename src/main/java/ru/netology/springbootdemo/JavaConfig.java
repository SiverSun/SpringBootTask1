package ru.netology.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class JavaConfig {
    @Bean
    @Profile("dev")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @Profile("prod")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
