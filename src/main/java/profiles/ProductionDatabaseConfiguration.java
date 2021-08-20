package profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class ProductionDatabaseConfiguration {
    @Bean
    public Database maDatabase (){
        return  new Database("oracle","url_oracle","mot_de_passe_oracle","driver_oracle");
    }

}
