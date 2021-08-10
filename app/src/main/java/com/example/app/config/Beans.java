package com.example.app.config;

import com.example.business.ProfileService;
import com.example.business.port.ProfileRepositoryPort;
import com.fasterxml.jackson.databind.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public ProfileService profileService(ProfileRepositoryPort r) {
        return new ProfileService(r);
    }

    @Bean
    public Module getTryModule() {
        return new TryModule();
    }

}
