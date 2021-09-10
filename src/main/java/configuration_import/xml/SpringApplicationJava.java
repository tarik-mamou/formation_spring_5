package configuration_import.xml;

import commun.Etudiant;
import configuration_import.ConfigurationApplication1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationJava {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationApplicationAvecXml.class);
        Etudiant etudiant = ctx.getBean("monEtudiant",Etudiant.class);
        System.out.println(etudiant);

    }
}
