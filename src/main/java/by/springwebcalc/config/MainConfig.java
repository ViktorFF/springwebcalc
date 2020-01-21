package by.springwebcalc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("by.springwebcalc")
public class MainConfig {

    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/views/");
        resourceViewResolver.setSuffix(".jsp");
        return resourceViewResolver;
    }
}
