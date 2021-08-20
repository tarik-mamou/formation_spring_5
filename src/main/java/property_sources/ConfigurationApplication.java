package property_sources;

import autowiring.Cartable;
import autowiring.Cours;
import autowiring.Etudiant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:property_sources/app.properties")
public class ConfigurationApplication {

    /*@Bean
    public Personne maPersonne() {
        return new Personne(2);
    }*/

    @Bean
    public PersonneAvecValueAnn maPersonneAvecValueAnn () {
        return new PersonneAvecValueAnn(2);
    }
}

