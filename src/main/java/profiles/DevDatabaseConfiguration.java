package profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("developpement")
public class DevDatabaseConfiguration {

    @Bean
    public Database maDatabase (){
        return  new Database("h2","url_h2","mot_de_passe_h2","driver_h2");
    }
}
