package profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({ProductionDatabaseConfiguration.class, DevDatabaseConfiguration.class})
public class ConfigurationApplication {

    @Bean
    public Service monService() {
        return new Service();
    }
}
