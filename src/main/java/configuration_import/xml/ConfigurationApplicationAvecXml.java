package configuration_import.xml;

import commun.Cours;
import commun.Etudiant;
import configuration_import.ConfigurationApplication2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:mixJavaAndXml/application.xml"})
public class ConfigurationApplicationAvecXml {

    @Bean
    public Etudiant monEtudiant(Cours cours) {
        return new Etudiant(cours);
    }
}

