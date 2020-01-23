package by.springwebcalc.config;

import by.springwebcalc.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("by.springwebcalc")
public class ApplicationConfig {

    @Bean
    public Map<String, User> getMap() {
        return new HashMap<>();
    }
}
