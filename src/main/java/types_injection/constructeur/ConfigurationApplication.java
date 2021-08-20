package types_injection.constructeur;

import commun.Cours;
import commun.Etudiant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigurationApplication {
    @Bean
    public Cours monCours() {
        return new Cours("francais");
    }

    @Bean
    public Etudiant monEtudiant(Cours cours) {
        return new Etudiant(cours);
    }
}

