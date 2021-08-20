package scopes.singleton;

import commun.Cours;
import commun.Etudiant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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


    @Bean
    public Etudiant monEtudiant2() {
        return new Etudiant(monCours());
    }
}

