package spel.annotation_value;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:property_sources/app.properties")
public class ConfigurationApplication {




    @Bean
    public Cartable cartable() {
        return new Cartable();
    }
}

