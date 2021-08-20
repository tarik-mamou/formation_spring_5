package autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApplication {

    @Bean
    public Cours monCours() {
        return new Cours("francais");
    }

    @Bean
    public Cartable cartable() {
        return new Cartable();
    }

    @Bean
    public Etudiant monEtudiant(Cours cours) {
        return new Etudiant(cours,"ahmed");
    }
}

