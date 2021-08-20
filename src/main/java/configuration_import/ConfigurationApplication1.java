package configuration_import;

import commun.Cours;
import commun.Etudiant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ ConfigurationApplication2.class})
public class ConfigurationApplication1 {
    @Bean
    public Etudiant monEtudiant(Cours cours) {
        return new Etudiant(cours);
    }
}

