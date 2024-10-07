package ru.vovk.spring315.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vovk.spring315.service.UserService;
import ru.vovk.spring315.service.UserServiceImpl;

@Configuration
public class ServiceConfig {
    @Bean
    public UserService service() {
        return new UserServiceImpl();
    }
}
