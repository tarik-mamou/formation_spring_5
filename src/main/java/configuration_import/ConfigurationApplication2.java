package configuration_import;

import commun.Cours;
import commun.Etudiant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApplication2 {
    @Bean
    public Cours monCours() {
        return new Cours("francais");
    }




}

