package types_injection.setter;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApplication {
    @Bean
    public Cours monCours() {
        return new Cours("francais");
    }

    @Bean
    public Etudiant monEtudiant() {
        Etudiant etudiant= new Etudiant();
        etudiant.setCours(monCours());
        return etudiant;
    }
}

