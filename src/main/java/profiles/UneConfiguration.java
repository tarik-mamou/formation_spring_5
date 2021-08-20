package profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
public class UneConfiguration {

    @Bean
    public Service monService() {
        return new Service();
    }

    @Bean("maDatabase")
    @Profile("production")
    public Database maDatabase (){
        return  new Database("oracle","url_oracle","mot_de_passe_oracle","driver_oracle");
    }



    @Bean("maDatabase")
    @Profile("developpement")
    public Database maDatabaseDev (){
        return  new Database("h2","url_h2","mot_de_passe_h2","driver_h2");
    }
}
